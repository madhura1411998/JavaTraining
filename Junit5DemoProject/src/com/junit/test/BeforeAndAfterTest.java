package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {
	Calculator cal;

	@BeforeEach
	public void init() {
		cal=new Calculator();
		System.out.println("Before each method is called now");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After each testcase");
	}
	
//	@BeforeAll
//	public void beforeAll() {
//		System.out.println("before all");
//	}
//	
//	@AfterAll
//	public void afterAll() {
//		System.out.println("After all");
//	}

	
	@Test
	@DisplayName("Adding two numbers")
	public void testAddMethod() {
		int sum=cal.add(10,100);
		assertEquals(110,sum);
		System.out.println("Total is : "+sum);
	}
	@Test
	@DisplayName("Subtracting two numbers")
	public void testSubMethod() {
		int sum=cal.sub(10,100);
		assertEquals(-90,sum);
		System.out.println("Sub is : "+sum);
	}
	@Test
	@DisplayName("Product two numbers")
//	@Disabled
	public void testProductMethod() {
		int sum=cal.product(5,100);
		assertEquals(500,sum);
		System.out.println("Product is : "+sum);
	}
	public static void main(String[] args) {
		
	}
}
