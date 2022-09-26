package com.zhimingo.hipay.core;

public enum YesOrNo {

    YES(1, "是"),
    NO(0, "否");

    private final Integer value;

    private final String desc;

    YesOrNo(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
