package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

class CalculatorTest {

	@Test
	@DisplayName("Adding two numbers")
	public void testAddMethod() {
		Calculator cal=new Calculator();
		int sum=cal.add(10,100);
		assertEquals(110,sum);
		System.out.println("Total is : "+sum);
	}
	@Test
	@DisplayName("Subtracting two numbers")
	public void testSubMethod() {
		Calculator cal=new Calculator();
		int sum=cal.sub(10,100);
		assertEquals(-90,sum);
		System.out.println("Sub is : "+sum);
	}
	@Test
	@DisplayName("Product two numbers")
//	@Disabled
	public void testProductMethod() {
		Calculator cal=new Calculator();
		int sum=cal.product(5,100);
		assertEquals(500,sum);
		System.out.println("Product is : "+sum);
	}
	public static void main(String[] args) {
		
	}

}
