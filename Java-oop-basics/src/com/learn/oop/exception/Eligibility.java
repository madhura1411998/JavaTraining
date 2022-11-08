package com.learn.oop.exception;

public class Eligibility {
public static void eligible(Integer exp) {
	if(exp<10) {
		throw new ArithmeticException("This person is not eleigible to be a senior system architect");
	}
	else {
		System.out.println("This person is eligible");
	}
}
public static void main(String[] args) {
	eligible(19);
}
}
