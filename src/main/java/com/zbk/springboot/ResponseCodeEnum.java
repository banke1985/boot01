package com.zbk.springboot;

public enum ResponseCodeEnum {

	UNKNOWN_ERROR("-1","未知错误"),
    SUCCESS("10000","成功"),
    USER_NOT_EXIST("1","用户不存在"),
    USER_IS_EXISTS("2","用户已存在"),
    DATA_IS_NULL("3","数据为空"),
    ;
    private String code;
    private String msg;
 
    ResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
 
    public String getCode() {
        return code;
    }
 
    public String getMsg() {
        return msg;
    }


}
