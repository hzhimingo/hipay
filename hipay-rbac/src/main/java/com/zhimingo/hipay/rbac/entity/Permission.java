package com.zhimingo.hipay.rbac.entity;

import com.zhimingo.hipay.rbac.enums.DeletedStatus;
import com.zhimingo.hipay.rbac.enums.PermissionStatus;
import com.zhimingo.hipay.rbac.enums.PermissionType;

import java.time.LocalDateTime;

/**
 * 权限信息实体类
 */
public class Permission {

    /**
     * 权限ID
     */
    private Long id;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 权限类型
     */
    private PermissionType type;

    /**
     * 权限状态
     */
    private PermissionStatus status;

    /**
     * 是否已被删除
     */
    private DeletedStatus deleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PermissionType getType() {
        return type;
    }

    public void setType(PermissionType type) {
        this.type = type;
    }

    public PermissionStatus getStatus() {
        return status;
    }

    public void setStatus(PermissionStatus status) {
        this.status = status;
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
        return "Permission{" +
                "id=" + id +
                ", permissionName='" + permissionName + '\'' +
                ", remark='" + remark + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", deleted=" + deleted +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
