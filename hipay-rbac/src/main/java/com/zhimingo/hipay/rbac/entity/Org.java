package com.zhimingo.hipay.rbac.entity;

import com.zhimingo.hipay.rbac.enums.DeletedStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 机构信息实体类
 */
@Entity
@Table(name = "org")
public class Org {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
     * 机构编号: 生成规则：区域码+至少三位自增
     */
    @Column(name = "org_no", nullable = false)
    private String orgNo;

    /**
     * 机构名称
     */
    @Column(name = "org_name", nullable = false)
    private String orgName;

    /**
     * 区域信息
     */
    @Column(name = "area_code", nullable = false)
    private String area;

    /**
     * 详细地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 父级机构主键ID
     */
    @Column(name = "parent")
    private Long parent;

    /**
     * 是否有子机构
     */
    @Column(name = "has_children", nullable = false)
    private Integer hasChildren;

    /**
     * 是否被删除
     */
    @Column(name = "deleted", nullable = false)
    private DeletedStatus deleted;

    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public Integer getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Integer hasChildren) {
        this.hasChildren = hasChildren;
    }

    public DeletedStatus getDeleted() {
        return deleted;
    }

    public void setDeleted(DeletedStatus deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Org{" +
                "id=" + id +
                ", orgNo='" + orgNo + '\'' +
                ", orgName='" + orgName + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", parent=" + parent +
                ", hasChildren=" + hasChildren +
                ", deleted=" + deleted +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
