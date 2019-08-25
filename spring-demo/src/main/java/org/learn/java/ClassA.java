package org.learn.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component
public class ClassA {
	
	public String doSomthing()
	{
		return "Hello Srring World";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method of calss A get called");
	}
	
	@PreDestroy
	public void predestroid()
	{
		System.out.println("Destroid method of calss A get called");
	}

}
