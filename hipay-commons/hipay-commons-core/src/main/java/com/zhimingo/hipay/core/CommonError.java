package com.zhimingo.hipay.core;

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

    CommonError(String code, String msg) {
        this.code = code;
        this.msg = msg;
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
