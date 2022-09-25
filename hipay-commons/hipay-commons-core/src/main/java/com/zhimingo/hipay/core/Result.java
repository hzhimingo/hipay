package com.zhimingo.hipay.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 全局统一响应封装类
 * @param <T>
 */
@Getter
@AllArgsConstructor
public class Result<T> {

    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误信息
     */
    private final String msg;

    /**
     * 响应数据
     */
    private final T data;

    public static <T> Result<T> response(String code, String msg, T data) {
        return new Result<>(code, msg, data);
    }

    public static <T> Result<T> ok(T data) {
        return response("0", "ok", data);
    }

    public static <T> Result<T> fail(String code, String msg) {
        return response(code, msg, null);
    }

    public static <T> Result<T> fail(BaseError error) {
        return fail(error.getCode(), error.getMsg());
    }

    public static <T> Result<T> defaultFail() {
        return fail(CommonError.SERVER_ERROR);
    }

}
