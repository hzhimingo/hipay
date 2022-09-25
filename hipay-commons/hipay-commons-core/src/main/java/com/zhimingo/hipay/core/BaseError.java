package com.zhimingo.hipay.core;

public interface BaseError {

    /**
     * 获取错误码
     * @return String 错误码
     */
    String getCode();

    /**
     * 获取错误信息
     * @return String 错误信息
     */
    String getMsg();
}
