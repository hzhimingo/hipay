package com.zhimingo.hipay.rbac.dto.form;

/**
 * 机构创建表单
 */
public class CreateOrgForm {

    /**
     * 区域ID
     */
    private String areaCode;

    /**
     * 机构名称
     */
    private String orgName;

    /**
     * 机构详细地址
     */
    private String address;

    /**
     * 父机构ID
     */
    private Long parent;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "CreateOrgForm{" +
                "areaCode='" + areaCode + '\'' +
                ", orgName='" + orgName + '\'' +
                ", address='" + address + '\'' +
                ", parent=" + parent +
                '}';
    }
}
