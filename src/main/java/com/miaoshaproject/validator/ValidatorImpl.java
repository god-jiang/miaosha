package com.miaoshaproject.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author god-jiang
 * @date 2019/12/25
 */
@Component
public class ValidatorImpl implements InitializingBean {

    private Validator validator;

    /**
     * @author god-jiang
     * @date 2019/12/25
     * @param [ bean: 任何bean对象]
     * @return ValidationResult
     * @description 实现校验方法并返回校验结果
     */
    public ValidationResult validate(Object bean) {
        ValidationResult validationResult = new ValidationResult();
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(bean);
        if (constraintViolationSet.size() > 0) {
            //有错误
            validationResult.setHasErrors(true);
            //遍历每个字段发生了什么错误
            constraintViolationSet.forEach(constraintViolation->{
                String errMsg = constraintViolation.getMessage();
                String propertyName = constraintViolation.getPropertyPath().toString();
                validationResult.getErrorMsgMap().put(propertyName, errMsg);
            });
        }
        return validationResult;
    }

    /**
     * @author Zhang Yifei
     * @date 2019/12/10
     * @param
     * @return void
     * @description Bean初始化后，会调用这个方法
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        //将hibernate validator通过工厂的初始化方式使其实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
