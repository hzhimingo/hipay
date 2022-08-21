package com.zhimingo.hipay.rbac.entity;

import com.zhimingo.hipay.rbac.enums.AreaLevel;

import javax.persistence.*;

/**
 * 区域信息实体类
 */
@Entity
@Table(name = "area")
public class Area {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
     * 地区码
     */
    @Column(name = "code", nullable = false)
    private String code;

    /**
     * 区域名称
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 区域类型
     */
    @Column(name = "level", nullable = false)
    private AreaLevel level;

    /**
     * 父区域主键ID
     */
    @Column(name = "parent")
    private Long parent;

    /**
     * 地区上下级关系
     */
    @Column(name = "path", nullable = false)
    private String path;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public AreaLevel getLevel() {
        return level;
    }

    public void setLevel(AreaLevel level) {
        this.level = level;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", parent=" + parent +
                ", path='" + path + '\'' +
                '}';
    }
}
