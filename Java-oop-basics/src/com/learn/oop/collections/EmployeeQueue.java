package com.learn.oop.collections;

//import java.util.Iterator;
import java.util.PriorityQueue;

public class EmployeeQueue {
	public static void main(String[] args) {
		PriorityQueue<Employee> pst=new PriorityQueue<>();
		Employee e1=new Employee(1,"Riya");
		Employee e2=new Employee(1,"Siya");
		Employee e3=new Employee(1,"Diya");
		Employee e4=new Employee(1,"Riya");
		pst.add(e1);
		pst.add(e2);
		pst.add(e3);
		pst.add(e4);
		
		
//		Iterator<Employee> itr=pst.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
