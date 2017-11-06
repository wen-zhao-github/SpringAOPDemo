package com.example.wen.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectDemo {
	//@Before("execution(public void add*())")
	@Before("execution(* add*())")
	//@Before("execution(public void add*())")
	public void beforeAddAccount(){
		System.out.println("Before advice >>> executing addAccount()...");
	}

}
