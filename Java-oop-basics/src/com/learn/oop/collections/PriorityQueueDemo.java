package com.learn.oop.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> customerQueue =new PriorityQueue<>();
		customerQueue.add("Amit");
		customerQueue.add("Rakesh");
		customerQueue.add("Shivam");	
		System.out.println("Lead is "+customerQueue.peek());
		Iterator<String> itr= customerQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
