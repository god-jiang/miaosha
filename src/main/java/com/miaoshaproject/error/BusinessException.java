package com.miaoshaproject.error;

/**
 * @author god-jiang
 * @date 2019/12/22 14:38
 * @description 包装器业务异常类实现
 */
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    /**
     * @author god-jiang
     * @date 2019/12/22
     * @param commonError:
     * @return null
     * @description 直接接收EmBusinessError的传参用于构造业务异常
     */
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    /**
     * @author god-jiang
     * @date 2019/12/22
     * @param commonError：
     * @param errMsg :错误信息
     * @return null
     * @description 接收自定义errMsg的方式构造业务异常
     */
    public BusinessException(CommonError commonError,String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErMsg(String errMsg) {
        this.commonError.setErMsg(errMsg);
        return this;
    }
}
