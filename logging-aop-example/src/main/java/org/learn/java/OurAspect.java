package org.learn.java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OurAspect {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OurAspect.class);
	
	
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

		LOGGER.info("Rached to join point.");

		String s = (String) joinPoint.proceed();
		s = "What a Powerfull tool is AOP";
		return s;
	}

}
