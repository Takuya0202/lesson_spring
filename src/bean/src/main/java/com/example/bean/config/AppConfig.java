package com.example.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bean.service.BusinessLogic;
import com.example.bean.service.impl.SampleLogicImpl;
import com.example.bean.service.impl.TestLogicImpl;

// Beanの定義方法として、@componentを使ったクラスに付与する方法とconfigurationで定義する方法がある。
@Configuration
public class AppConfig {
    // DIコンテナにtestとsampleのbeanを登録する
    @Bean("test")
    public BusinessLogic dataLogic() {
        return new TestLogicImpl();
    }

    @Bean("sample")
    public BusinessLogic sampleLogic() {
        return new SampleLogicImpl();
    }
}
