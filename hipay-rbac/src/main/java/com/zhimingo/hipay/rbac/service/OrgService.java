package com.zhimingo.hipay.rbac.service;

import com.zhimingo.hipay.rbac.dto.form.CreateOrgForm;

public interface OrgService {

    /**
     * 创建机构
     * @return 机构编号
     */
    String createOrg(CreateOrgForm form);

    /**
     * 根据主键删除机构信息
     * @param orgId 机构ID
     */
    void deleteOrg(Long orgId);

    void updateOrg();
}
