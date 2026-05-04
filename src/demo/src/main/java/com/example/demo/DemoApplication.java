package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.used.Greet;

@SpringBootApplication
public class DemoApplication {

	// springアプリケーションのエントリーポイントとなるクラス。
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
				.getBean(DemoApplication.class).execute();
	}

	// DIされる箇所
	@Autowired
	private Greet g;

	public void execute() {
		System.out.println(g.greet());
	}
}
