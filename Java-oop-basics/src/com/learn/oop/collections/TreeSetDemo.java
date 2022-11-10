package com.learn.oop.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> cars=new TreeSet<>();
		cars.add("Honda");
		cars.add("Mercedes");
		cars.add("BMW");
		
		Iterator<String> itr=cars.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
