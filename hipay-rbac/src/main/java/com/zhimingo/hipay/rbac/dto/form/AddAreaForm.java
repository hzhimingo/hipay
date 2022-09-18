package com.zhimingo.hipay.rbac.dto.form;

public class AddAreaForm {

    /**
     * 地区码
     */
    private String code;

    /**
     * 地区名称
     */
    private String name;

    /**
     * 地区等级
     */
    private Integer level;

    /**
     * 父级地区ID
     */
    private Long parent;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "AddAreaForm{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", parent=" + parent +
                '}';
    }
}
