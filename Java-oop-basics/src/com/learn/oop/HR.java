package com.learn.oop;

public class HR extends Employee{
	Integer bonus=20000;
	Integer total =bonus +baseSalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR anisha =new HR();
		System.out.println("Total salary of Anisha is:"+anisha.total);
	}
}
