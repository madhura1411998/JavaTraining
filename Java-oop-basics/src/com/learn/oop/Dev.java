package com.learn.oop;

public class Dev extends Employee{
	Integer bonus=25000;
	Integer total =bonus +baseSalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dev nishant =new Dev();
		System.out.println("Total salary of Nishant is:"+nishant.total);
	}

}
