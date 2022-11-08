package com.learn.oop;

public class Sales extends Employee {
	Integer bonus=10000;
	Integer incentive=0;
	void working() {
		System.out.println("in Sales class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales ashish =new Sales();
		ashish.incentive=2000;
		ashish.totalSalary(ashish.baseSalary,ashish.bonus,ashish.incentive);
		ashish.working();
	}
}
