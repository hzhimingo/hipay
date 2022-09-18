package com.zhimingo.hipay.core;

public interface BaseError {

    /**
     * 获取模块代码
     * @return String 模块代码
     */
    String getModule();

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
