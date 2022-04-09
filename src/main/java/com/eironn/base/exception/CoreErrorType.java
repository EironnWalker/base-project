package com.eironn.base.exception;

import lombok.Getter;

@Getter
public enum CoreErrorType implements ErrorType {

    INSERT_FAILED("030100", "插入失败！"),
    MISSING_PARAM("030200", "缺少必填参数！"),
    DATABASE_DATA_WRONG("030300", "数据异常！"),
    BUSINESS_WRONG("030400", "业务异常！"),
    UPDATE_FAILED("030500", "更新失败！"),
    FILE_READING_FAILED("030600", "读写失败！"),
    CONFIRM_OPERATION("030700", "确认操作！");

    /**
     * 错误类型码
     */
    private String code;
    /**
     * 错误类型描述信息
     */
    private String msg;

    CoreErrorType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
