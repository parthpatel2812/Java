package org.learn.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;

//@Service
//@Repository
//@Component
//@Scope(value="prototype")

public class ClassB {

	@Value("1001")
	private int id;
	
	//@Autowired // It will bind object of a to b.
	@Inject
	private ClassA a;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method of calss B get called");
	}
	
	@PreDestroy
	public void predestroid()
	{
		System.out.println("Destroid method of calss B get called");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a2) {
		this.a = a2;
		
	}
	
	
}
