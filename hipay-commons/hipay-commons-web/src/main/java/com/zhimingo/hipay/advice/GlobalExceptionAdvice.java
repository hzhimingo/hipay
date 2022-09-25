package com.zhimingo.hipay.advice;

import com.zhimingo.hipay.core.CommonException;
import com.zhimingo.hipay.core.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionAdvice.class);

    /**
     * 默认异常处理
     */
    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e) {
        log.error("系统异常", e);
        return Result.defaultFail();
    }

    /**
     * 处理CommonException业务逻辑异常
     */
    @ExceptionHandler(CommonException.class)
    public Result<?> handleCommonException(CommonException e) {
        return Result.fail(e.getCode(), e.getMsg());
    }

    /**
     * 处理参数缺失异常
     */
    public Result<?> handleMissingParam() {
        return null;
    }
}
