package org.ssglobal.training.codes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.ssglobal.training.codes.HelloWorld;

@ExtendWith(MockitoExtension.class)
public class TestHelloWorld {
	private HelloWorld hw;
	
	@BeforeEach
	public void setUp() {
		hw = new HelloWorld();
	}
	
	@AfterEach
	public void tearDown() {
		hw = null;
	}
	
	@Test
	public void testGreet() {
		
		String res = hw.greet();
		
		assertEquals("Friday", res);
	}

}
