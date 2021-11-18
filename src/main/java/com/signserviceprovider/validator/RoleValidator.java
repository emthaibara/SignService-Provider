package com.signserviceprovider.validator;

import com.signserviceprovider.exception.BaseException;
import com.signserviceprovider.util.ValidatorUtils;
import com.signserviceprovider.validator.annotation.IsIdCard;
import com.signserviceprovider.validator.annotation.IsLegalRole;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/16
 */

public class RoleValidator implements ConstraintValidator<IsLegalRole,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.isNull(value))
            throw new BaseException("role must be not null");
        return ValidatorUtils.checkRole(value);
    }
}
