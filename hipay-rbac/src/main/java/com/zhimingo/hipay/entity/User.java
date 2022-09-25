package com.zhimingo.hipay.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 用户信息实体类
 */
@Entity
@Getter
@Setter
@ToString
@Table(schema = "hi_pay", name = "user")
public class User {

    /**
     * 用户ID
     */
    @Id
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 加密后到密码
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * 用户头像地址
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 手机号码
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 邮箱地址
     */
    @Column(name = "email")
    private String email;

    /**
     * 用户状态 0-未启用 1-已启用 2-冻结
     */
    @Column(name = "status", nullable = false)
    private Integer status;

    /**
     * 是否已被删除 0-否 1-是
     */
    @Column(name = "deleted", nullable = false)
    private Integer deleted;

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
}
