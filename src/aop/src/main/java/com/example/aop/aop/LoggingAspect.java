package com.example.aop.aop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // メソッド開始時の時間をログとして出力
    // @Before("execution(* com.example.aop.service.TargetService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        LocalDateTime startTime = LocalDateTime.now();
        String formattedStartTime = startTime.format(DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println("before advice called");
        System.out.println("Method" + joinPoint.getSignature());
        System.out.println("Start time: " + formattedStartTime);
    }

    // @After("execution(* com.example.aop.service.TargetService.*(..))")
    // メソッド終了時の時間をログとして出力
    public void afterAdvice(JoinPoint joinPoint) {
        LocalDateTime endTime = LocalDateTime.now();
        String formattedEndTime = endTime.format(DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println("after advice called");
        System.out.println("Method" + joinPoint.getSignature());
        System.out.println("End time: " + formattedEndTime);
    }

    // メソッドの前後で時間を計測してログとして出力
    @Around("execution(* com.example.aop.service.TargetService.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        System.out.println("around advice before");
        System.out.println("target class" + joinPoint.getSignature()
                .getDeclaringTypeName());
        System.out.println("target method" + joinPoint.getSignature().getName());

        // 実行メソッドを呼び出す。
        Object result = joinPoint.proceed();

        System.out.println("around advice after");
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("elapsed time: " + elapsedTime + "ms");
        return result;
    }
}
