package com.signserviceprovider.validator;

import com.signserviceprovider.exception.BaseException;
import com.signserviceprovider.util.ValidatorUtils;
import com.signserviceprovider.validator.annotation.IsIdCard;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/16
 */
public class IdCardValidator implements ConstraintValidator<IsIdCard,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.isNull(value))
            throw new BaseException("idcard must be not null");
        return ValidatorUtils.checkIdCard(value);
    }
}
