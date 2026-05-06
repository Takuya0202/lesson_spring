package com.example.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.aop.service.TargetService;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args)
				.getBean(AopApplication.class).execute();
	}

	private final TargetService targetService;

	public AopApplication(TargetService targetService) {
		this.targetService = targetService;
	}

	public void execute() {
		targetService.sayHello("John");
		System.out.println("--------------------------------");
		targetService.sayGoodbye("John");
	}
}
