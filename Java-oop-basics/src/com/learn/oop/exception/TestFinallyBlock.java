package com.learn.oop.exception;

public class TestFinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");
			int num=100/0;
			System.out.println(num);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this part is executed regardless the exception is happening or not");;
		}
		System.out.println("Continue");
	}
}
