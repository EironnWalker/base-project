package com.eironn.base.exception;

/**
 * 档案模块异常处理
 *
 * @author liudw
 * @date 2019-05-24 10:55
 **/
public class BusinessException extends BaseException {

    public BusinessException() {
        super(CoreErrorType.BUSINESS_WRONG);
    }

    public BusinessException(String message) {
        super(CoreErrorType.BUSINESS_WRONG, message);
    }
}
