package com.example.sample_validation.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class GreetForm {
    @NotBlank(message = "名前を入力してください")
    @Size(max = 10, message = "10文字以内で入力してください")
    private String name;
}
