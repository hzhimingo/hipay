package com.zhimingo.hipay.rbac.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhimingo.hipay.core.CommonException;
import com.zhimingo.hipay.rbac.dto.form.AddAreaForm;
import com.zhimingo.hipay.rbac.entity.Area;
import com.zhimingo.hipay.rbac.repository.AreaRepository;
import com.zhimingo.hipay.rbac.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AreaServiceImpl implements AreaService {

    private static final Logger log = LoggerFactory.getLogger(AreaServiceImpl.class);

    private static final String AREA_CODE = "code";

    private static final String AREA_NAME = "name";

    private static final String AREA_NODE = "node";

    private final ObjectMapper objectMapper;

    private final AreaRepository areaRepository;

    public AreaServiceImpl(ObjectMapper objectMapper, AreaRepository areaRepository) {
        this.objectMapper = objectMapper;
        this.areaRepository = areaRepository;
    }

    @Override
    public void addArea(AddAreaForm form) {
        boolean isCodeExists = areaRepository.existsAreaByCode(form.getCode());
        if (isCodeExists) {
            throw new CommonException("0", "");
        }
        Area record = new Area();
        record.setCode(form.getCode());
        record.setName(form.getName());
        if (form.getParent() != null) {
            Optional<Area> optionalParentArea = areaRepository.findById(form.getParent());
            Area parentArea = optionalParentArea.orElseThrow(() -> new CommonException("0", ""));
            record.setParent(parentArea.getId());
            record.setPath(parentArea.getPath());
        }
        Area savedArea = areaRepository.save(record);
        savedArea.setPath(generatePath(savedArea.getPath(), savedArea.getId()));
        areaRepository.save(savedArea);
    }

    @SuppressWarnings("all")
    private String generatePath(String parent, Long currentAreaId) {
        try {
            if (parent == null) {
                List<String> path = Collections.singletonList(currentAreaId.toString());
                return objectMapper.writeValueAsString(path);
            }
            LinkedList<String> parentPath = objectMapper.readValue(parent, LinkedList.class);
            parentPath.add(currentAreaId.toString());
            return objectMapper.writeValueAsString(parentPath);
        } catch (Exception e) {
            log.error("json 转换失败", e);
            throw new CommonException("0", "");
        }
    }

    @Override
    public List<Area> subArea(Long id) {
        boolean isExists = areaRepository.existsById(id);
        if (!isExists) {
            return Collections.emptyList();
        }
        return areaRepository.findAreasByParent(id);
    }

    @Override
    public Optional<Area> getAreaInfo(String areaCode) {
        return Optional.ofNullable(areaRepository.findAreaByCode(areaCode));
    }

    @Override
    @SuppressWarnings("all")
    public HashMap<String, Object> getFullPath(Long id) {
        Optional<Area> optionalArea = areaRepository.findById(id);
        Area area = optionalArea.orElseThrow(() -> new CommonException("0", ""));
        try {
            LinkedList<String> pathNodes = objectMapper.readValue(area.getPath(), LinkedList.class);
            HashMap<String, Object> tree = new HashMap<>();
            pathNodes.forEach(node -> {
                Optional<Area> optionalNodeArea = areaRepository.findById(Long.valueOf(node));
                Area nodeArea = optionalNodeArea.orElseThrow(() -> new CommonException("0", ""));
                if (tree.isEmpty()) {
                    tree.put(AREA_CODE, nodeArea.getCode());
                    tree.put(AREA_NAME, nodeArea.getName());
                } else {
                    HashMap<String, String> child = new HashMap<>();
                    child.put(AREA_CODE, nodeArea.getCode());
                    child.put(AREA_NAME, nodeArea.getName());
                    tree.put(AREA_NODE, child);
                }
            });
            return tree;
        } catch (JsonProcessingException e) {
            log.error("json转换失败", e);
            return null;
        }
    }

    @Override
    public void updateArea() {

    }

    @Override
    public void deleteArea(Long id) {
        areaRepository.deleteById(id);
    }
}
