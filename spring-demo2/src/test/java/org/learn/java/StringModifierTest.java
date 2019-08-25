package org.learn.java;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.IsNot.not;


import org.junit.Test;

public class StringModifierTest {

	@Test
	public void replaceAllATest() {
		String testString = "all is well";
		String returnedString = new StringModifier().replaceAllA(testString);
		assertThat(returnedString, not(containsString("a")));
	}
	
}
