package com.miaoshaproject.error;

/**
 * @author god-jiang
 * @date 2019/12/22 14:28
 * @description 通用错误类型接口
 */
public interface CommonError {

    public int getErrCode();

    public String getErrMsg();

    public CommonError setErMsg(String errMsg);
}
