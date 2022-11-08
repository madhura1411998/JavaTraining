package com.learn.oop;
//parent class
public class Employee {
	Integer baseSalary=50000;
	void totalSalary(Integer bs,Integer bonus) {
		Integer total=bs+bonus;
		System.out.println(total);
	}
	void totalSalary(Integer bs,Integer bonus,Integer incentive) {
		Integer total=bs+bonus+incentive;
		System.out.println(total);
	}
	
	void working() {
		System.out.println("In employee class");
	}
}
