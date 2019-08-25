package org.learn.java.aop;

import org.springframework.stereotype.Component;

@Component
public class StringModifier {

	public String replaceAllA(String replacee) {
		
		System.out.println("Given string is replaced");
		
		return replacee.replace('a', 'A');
	}
}
