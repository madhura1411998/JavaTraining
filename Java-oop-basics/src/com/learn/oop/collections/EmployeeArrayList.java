package com.learn.oop.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> pst=new ArrayList<>();
		Employee e1=new Employee(1,"Riya");
		Employee e2=new Employee(2,"Siya");
//		Employee e3=new Employee(3,"Diya");
//		Employee e4=new Employee(4,"Riya");
		pst.add(e1);
		pst.add(e2);
//		pst.add(e3);
//		pst.add(e4);
		
		Iterator<Employee> itr=pst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getEmpid()+ " "+itr.next().getEmpName());
		}
		
		pst.remove(e2);
//		System.out.println("After removing employee e2");
//		for(Employee emp:pst) {
//			System.out.println(emp.getEmpid()+" "+emp.getEmpName());
//
//		}
//		Iterator<Employee> itr1=pst.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next().getEmpid()+ " "+itr1.next().getEmpName());
//		}
//		
	}
}
