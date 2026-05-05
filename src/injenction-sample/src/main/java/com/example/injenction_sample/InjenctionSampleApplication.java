package com.example.injenction_sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.injenction_sample.example.Example;

@SpringBootApplication
public class InjenctionSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjenctionSampleApplication.class, args)
				.getBean(InjenctionSampleApplication.class).execute();
	}

	// ここもコンストラクタインジェクション + Lombokを使った方式のほうがいいと思う。
	@Autowired
	private Example example;

	private void execute() {
		example.run();
	}
}
