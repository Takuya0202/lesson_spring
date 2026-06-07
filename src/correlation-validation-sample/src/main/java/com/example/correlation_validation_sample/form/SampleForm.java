package com.example.correlation_validation_sample.form;

import java.util.Objects;

import jakarta.validation.constraints.AssertTrue;
import lombok.Data;

@Data
public class SampleForm {
    private String password;
    private String confPassword;

    @AssertTrue(message = "パスワードが一致しません。")
    public boolean isSamePassword() {
        return Objects.equals(password, confPassword);
    }
}
