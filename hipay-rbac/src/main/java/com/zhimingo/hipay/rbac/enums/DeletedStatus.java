package com.zhimingo.hipay.rbac.enums;

import java.util.Arrays;
import java.util.Optional;

public enum DeletedStatus {

    NORMAL(0, "正常"),
    DELETED(1, "已删除");

    private final Integer value;

    private final String remark;

    DeletedStatus(Integer value, String remark) {
        this.value = value;
        this.remark = remark;
    }

    public Integer getValue() {
        return value;
    }

    public String getRemark() {
        return remark;
    }

    public static Optional<DeletedStatus> of(Integer value) {
        return Arrays.stream(values()).filter(deletedStatus -> deletedStatus.getValue().equals(value)).findAny();
    }
}
