package com.eironn.base.exception;

import com.eironn.base.entity.base.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandlerAdvice extends DefaultGlobalExceptionHandlerAdvice {

    @ExceptionHandler(value = {BusinessException.class})
    public Result businessFailed(BusinessException ex) {
        log.error(ExceptionUtils.getStackTrace(ex));
        return Result.fail(ex, ex.getMessage());
    }
}