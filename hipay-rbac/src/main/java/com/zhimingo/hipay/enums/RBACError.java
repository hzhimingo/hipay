package com.zhimingo.hipay.enums;

import com.zhimingo.hipay.core.BaseError;

public enum RBACError implements BaseError {

    ;

    private final String code;

    private final String msg;

    RBACError(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
