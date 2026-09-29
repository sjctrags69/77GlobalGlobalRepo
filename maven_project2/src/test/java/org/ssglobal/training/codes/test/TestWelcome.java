package org.ssglobal.training.codes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.Welcome;

public class TestWelcome {
	
	@Test
	public void testSayHi() {
		Welcome w = new Welcome();
		assertEquals("Hello", w.sayHi());
	}

}
