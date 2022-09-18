package com.zhimingo.hipay.core;

/**
 * 全局统一响应封装类
 * @param <T>
 */
public class Result<T> {

    /**
     * 默认响应码
     * 10000：代表接口调用成功
     */
    private static final String DEFAULT_SUCCESS_CODE = "10000";

    private static final String DEFAULT_MESSAGE = "success";

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

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> response(String code, String msg, T data) {
        return new Result<>(code, msg, data);
    }

    public static <T> Result<T> ok(String msg, T data) {
        return response(DEFAULT_SUCCESS_CODE, msg, data);
    }

    public static <T> Result<T> ok(T data) {
        return ok(DEFAULT_MESSAGE, data);
    }

    public static <T> Result<T> defaultFail() {
        return fail(CommonError.UNKNOW_ERROR);
    }

    public static <T> Result<T> fail(String code, String msg) {
        return response(code, msg, null);
    }

    public static <T> Result<T> fail(BaseError error) {
        String errorCode = null;
        if (error.getModule() != null) {
            errorCode = error.getModule() + error.getCode();
        } else {
            errorCode = error.getCode();
        }
        return fail(errorCode, error.getMsg());
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
