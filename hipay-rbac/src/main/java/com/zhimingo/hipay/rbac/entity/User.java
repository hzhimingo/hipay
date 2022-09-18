package com.zhimingo.hipay.rbac.entity;

import com.zhimingo.hipay.rbac.enums.DeletedStatus;
import com.zhimingo.hipay.rbac.enums.UserStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 用户信息实体类
 */
@Entity
@Table(name = "user")
public class User {

    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username", nullable = false)
    private String username;

    /**
     * 密码
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * 机构ID
     */
    @Column(name = "org", nullable = false)
    private Long org;

    /**
     * 手机号
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 邮箱地址
     */
    @Column(name = "email")
    private String email;

    /**
     * 用户状态
     */
    @Column(name = "status", nullable = false)
    private UserStatus status;

    /**
     * 是否已被删除
     */
    @Column(name = "deleted", nullable = false)
    private DeletedStatus deleted;

    /**
     * 用户扩展信息 JSON
     */
    @Column(name = "extra_info")
    private String extraInfo;

    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getOrg() {
        return org;
    }

    public void setOrg(Long org) {
        this.org = org;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return email;
    }

    public void setAddress(String address) {
        this.email = address;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public DeletedStatus getDeleted() {
        return deleted;
    }

    public void setDeleted(DeletedStatus deleted) {
        this.deleted = deleted;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", org=" + org +
                ", phone='" + phone + '\'' +
                ", address='" + email + '\'' +
                ", status=" + status +
                ", deleted=" + deleted +
                ", extraInfo='" + extraInfo + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
