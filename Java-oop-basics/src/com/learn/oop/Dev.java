package com.learn.oop;

class Employees{
	Integer baseSalary=50000;

}
public class Dev extends Employees{
	Integer bonus=25000;
	Integer total =bonus +baseSalary;
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Dev nishant =new Dev();
		System.out.println("Total salary of Nishant is:"+nishant.total);
	}

}
