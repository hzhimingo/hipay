package com.zhimingo.hipay.rbac.service;

import com.zhimingo.hipay.rbac.dto.form.AddAreaForm;
import com.zhimingo.hipay.rbac.entity.Area;

import java.util.HashMap;
import java.util.List;

/**
 * 地区码相关服务
 */
public interface AreaService {

    /**
     * 添加新区域
     * @param form 添加区域表单
     */
    void addArea(AddAreaForm form);

    /**
     * 通过区域ID查询下级区域
     * @param id 区域ID
     * @return 下级区域列表
     */
    List<Area> subArea(Long id);

    /**
     * 通过区域ID获取
     * @param id 区域ID
     * @return 区域路径树
     */
    HashMap<String, Object> getFullPath(Long id);

    /**
     * 更新区域信息
     */
    void updateArea();

    /**
     * 通过区域ID删除区域信息
     * @param id
     */
    void deleteArea(Long id);
}
