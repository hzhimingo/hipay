package com.zhimingo.hipay.rbac.service.impl;

import com.zhimingo.hipay.mvc.exception.HiPayException;
import com.zhimingo.hipay.rbac.dto.form.CreateOrgForm;
import com.zhimingo.hipay.rbac.entity.Area;
import com.zhimingo.hipay.rbac.repository.OrgRepository;
import com.zhimingo.hipay.rbac.service.AreaService;
import com.zhimingo.hipay.rbac.service.OrgService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrgServiceImpl implements OrgService {

    private final AreaService areaService;

    private final OrgRepository orgRepository;

    public OrgServiceImpl(AreaService areaService, OrgRepository orgRepository) {
        this.areaService = areaService;
        this.orgRepository = orgRepository;
    }

    @Override
    public String createOrg(CreateOrgForm form) {
        String orgNo = generateOrgNo(form.getAreaCode());
        return null;
    }

    private String generateOrgNo(String areaCode) {
        Optional<Area> optionalArea = areaService.getAreaInfo(areaCode);
        Area area = optionalArea.orElseThrow(() -> new HiPayException(0, ""));
        return null;
    }

    @Override
    public void deleteOrg(Long orgId) {
        orgRepository.deleteById(orgId);
    }

    @Override
    public void updateOrg() {

    }
}
