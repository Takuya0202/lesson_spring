package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.bean.service.BusinessLogic;

@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args)
				.getBean(BeanApplication.class).execute();
	}

	// DI 同じ型のbeanが複数ある場合は@Qualifierを使ってbeanを指定する。
	@Autowired
	@Qualifier("test")
	private BusinessLogic businessLogic1;

	@Autowired
	@Qualifier("sample")
	private BusinessLogic businessLogic2;

	public void execute() {
		businessLogic1.doLogic();
		businessLogic2.doLogic();
	}
}
