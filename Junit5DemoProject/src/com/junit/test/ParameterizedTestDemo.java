package com.junit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {

	//@ValueSource
	//@EnumSource
//	@MethodSource
//	@CsvSource
//	@CsvFileSource
//	@ArgumentsSource
	
	//Value source
	@ParameterizedTest(name="{index} -Run with the args = {0}")
	@ValueSource(ints= {1,3,5,7})
	public void valueSourceTest(int args) {
		System.out.println(args);
	}
	
	// Enum source
	enum TV{
		LG,Samsung,Toshiba
	}
	
	@ParameterizedTest
	@EnumSource(TV.class)
	public void enumSourceTest(TV tv) {
		System.out.println(tv);
	}
	//method source
	private static String[] cars() {
		return new String[] {"Maruti","Swift","Honda"};
	}
	
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		System.out.println(cars);
	}
	
	///csv source
	@ParameterizedTest
	@CsvSource({"Madhura","Riya","Tina"})
	public void csvSourceTest(String name) {
		System.out.println(name);
	}
}
