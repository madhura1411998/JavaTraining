package com.learn.oop.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<String> members=new HashSet<>();
		members.add("Madhura");
		members.add("Madhura");
		members.add("Peter");
		members.add("Riya");
		members.remove("Peter");
		Iterator<String> itr=members.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
