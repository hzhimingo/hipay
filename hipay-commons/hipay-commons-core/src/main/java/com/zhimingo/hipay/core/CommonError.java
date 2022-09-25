package com.zhimingo.hipay.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonError implements BaseError {

    SERVER_ERROR("999999", "服务异常，请稍后重试");

    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误信息
     */
    private final String msg;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
