package org.learn.java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OurAspect {

	@Pointcut("execution(* org.learn.java.aop.*.*(..))")
	public void doPointCut() {

	}

	/*
	 * @Before("doPointCut()") public void logSomethingBefore() {
	 * System.out.println("Method execution starting"); }
	 * 
	 * @After("doPointCut()") public void logSomethingAfter() {
	 * System.out.println("Method execution End"); }
	 */

	@Around("doPointCut()")
	public String logEventAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Rached to join point.");

		String s = (String) joinPoint.proceed();
		s = "What a Powerfull tool is AOP";
		return s;
	}

}
