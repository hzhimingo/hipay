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
 * 权限信息表
 */
@Entity
@Getter
@Setter
@ToString
@Table(schema = "hi_pay", name = "permission")
public class Permission {

    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 权限状态
     */
    @Column(name = "status", nullable = false)
    private Integer status;

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
