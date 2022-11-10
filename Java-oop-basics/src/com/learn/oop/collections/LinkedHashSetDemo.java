package com.learn.oop.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("HP");
		lhs.add("Lenovo");
		lhs.add("Dell");
		lhs.add("Dell");
		lhs.add("HP");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
