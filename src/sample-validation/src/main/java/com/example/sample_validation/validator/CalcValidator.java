package com.example.sample_validation.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.sample_validation.form.CalcForm;

@Component
public class CalcValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return CalcForm.class.isAssignableFrom(clazz);
    }

    // 左辺が奇数、右辺が偶数であるためのバリデーション
    @Override
    public void validate(Object target, Errors errors) {
        CalcForm form = (CalcForm) target;
        if (form.getVal1() != null && form.getVal2() != null) {
            if (!((form.getVal1() % 2 == 1) && (form.getVal2() % 2 == 0))) {
                errors.rejectValue("val1", null, "左辺は奇数、右辺は偶数である必要があります。");
            }
        }
    }
}
