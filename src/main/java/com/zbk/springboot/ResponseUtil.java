package com.zbk.springboot;

public class ResponseUtil {
	/**成功且带数据**/
    public static ResponseData success(Object object){
    	ResponseData result = new ResponseData();
        result.setCode(ResponseCodeEnum.SUCCESS.getCode());
        result.setMsg(ResponseCodeEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
    /**成功但不带数据**/
    public static ResponseData success(){
 
        return success(null);
    }
    /**失败**/
    public static ResponseData error(String code,String msg){
    	ResponseData result = new ResponseData();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


}
