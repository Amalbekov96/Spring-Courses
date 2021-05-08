package ru.otus.spring.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* ru.otus.dao.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Вызов метода : " + joinPoint.getSignature().getName());
    }
}
