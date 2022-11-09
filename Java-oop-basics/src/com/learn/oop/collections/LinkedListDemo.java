package com.learn.oop.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> fruits=new LinkedList<>();
		fruits.add("Mango");
		fruits.add("Apples");
		fruits.add("Oranges");
		
		fruits.removeFirst();
		fruits.removeLast();
		Iterator<String> itr= fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
