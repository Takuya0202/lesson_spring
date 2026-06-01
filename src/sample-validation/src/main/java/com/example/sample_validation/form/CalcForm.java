package com.example.sample_validation.form;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CalcForm {
    @NotNull(message = "値を入力してください")
    @Range(min = 1, max = 10, message = "1から10の値を入力してください")
    private Integer val1;

    @NotNull(message = "値を入力してください")
    @Range(min = 1, max = 10, message = "1から10の値を入力してください")
    private Integer val2;
}
