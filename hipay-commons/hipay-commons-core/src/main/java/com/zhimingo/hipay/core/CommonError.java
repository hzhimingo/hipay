package com.zhimingo.hipay.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonError implements BaseError {

    UNKNOW_ERROR("10001", "服务异常，请稍后重试");

    private final String code;

    private final String msg;

    @Override
    public String getModule() {
        return null;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
