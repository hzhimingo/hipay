package com.zhimingo.hipay.rbac.enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * 用户状态枚举类
 */
public enum UserStatus {

    INACTIVE(0, "未激活"),
    ACTIVE(1, "已激活"),
    LOCKED(2, "已锁定");

    private final Integer value;

    private final String remark;

    UserStatus(Integer value, String remark) {
        this.value = value;
        this.remark = remark;
    }

    public Integer getValue() {
        return value;
    }

    public String getRemark() {
        return remark;
    }

    public static Optional<UserStatus> of(Integer value) {
        return Arrays.stream(values()).filter(userStatus -> userStatus.getValue().equals(value)).findAny();
    }
}
