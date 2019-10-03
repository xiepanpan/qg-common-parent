package com.qg.dto;

import com.qg.dto.ReturnResult;

/**
 * @author: xiepanpan
 * @Date: 2019/10/3
 * @Description: 统一返回工具类
 */
public class ReturnResultUtils {

    /**
     * 返回成功
     * @return
     */
    public static ReturnResult returnSuccess(Object data) {
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(0);
        returnResult.setData(data);
        return returnResult;
    }

    public static ReturnResult returnFail(Integer code,String message) {
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(code);
        returnResult.setMessage(message);
        return returnResult;
    }

}
