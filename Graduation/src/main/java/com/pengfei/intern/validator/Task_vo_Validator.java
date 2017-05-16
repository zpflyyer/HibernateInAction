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
        ValidationUtils.rejectIfEmpty(errors,"title",null,"���ⲻ��Ϊ��");
        ValidationUtils.rejectIfEmpty(errors,"content",null,"���ݲ���Ϊ��");
        ValidationUtils.rejectIfEmpty(errors,"deadline",null,"��ֹ���ڲ���Ϊ��");
        ValidationUtils.rejectIfEmpty(errors,"internList",null,"��������ָ��һ��ʵϰ��");

    }
}
