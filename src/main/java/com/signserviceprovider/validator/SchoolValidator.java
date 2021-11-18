package com.signserviceprovider.validator;

import com.signserviceprovider.exception.BaseException;
import com.signserviceprovider.util.ValidatorUtils;
import com.signserviceprovider.validator.annotation.IsIdCard;
import com.signserviceprovider.validator.annotation.IsRegisteredSchool;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/16
 */
public class SchoolValidator implements ConstraintValidator<IsRegisteredSchool,String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.isNull(value))
                throw new BaseException("school must be not null");
        return ValidatorUtils.checkSchool(value);
    }
}
