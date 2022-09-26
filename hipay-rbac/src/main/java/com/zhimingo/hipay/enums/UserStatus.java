package com.zhimingo.hipay.enums;

/**
 * 用户状态枚举类
 */
public enum UserStatus {

    INACTIVE(0, "未激活"),
    ACTIVE(1, "已激活"),
    LOCKED(2, "已锁定");

    private final Integer status;

    private final String desc;

    UserStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
