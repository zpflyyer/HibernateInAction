package com.pengfei.intern.validator;

import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.form_vo.Task_vo;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by zhaopen on 5/13/2017.
 */
public class Task_vo_Validator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return Task_vo.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"title",null,"标题不能为空");
        ValidationUtils.rejectIfEmpty(errors,"content",null,"内容不能为空");
        ValidationUtils.rejectIfEmpty(errors,"deadline",null,"截止日期不能为空");
        ValidationUtils.rejectIfEmpty(errors,"internList",null,"必须至少指派一个实习生");

    }
}
