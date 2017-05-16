package com.pengfei.intern.validator;

import com.pengfei.intern.vo.ItrBean;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by zhaopen on 5/13/2017.
 */
public class UserValidator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return ItrBean.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"empName",null,"用户名不能为空");
        ValidationUtils.rejectIfEmpty(errors,"empPass",null,"密码不能为空");
    }
}
