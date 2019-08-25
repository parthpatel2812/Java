package org.learn.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {

		/*ClassB b = new ClassB();
		
		ClassA a = new ClassA();
		b.setA(a);
		
		System.out.println(b.getA().doSomthing()); */
		
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
			ClassB b1 = context.getBean(ClassB.class);
		//	ClassB b1 = (ClassB) context.getBean("ClassB");
				
			((AbstractApplicationContext) context).close();
		/*
		ClassB b1 = context.getBean(ClassB.class);
		ClassB b2 = context.getBean(ClassB.class);
		
		
		System.out.println(b1.getId());
		System.out.println(b1.getA().doSomthing());
		
		b1.setId(2020);
		System.out.println(b2.getId());
		System.out.println(b1.getId());
		
		context.close();
        */			

			
		
		
		
	}

}
