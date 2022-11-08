package com.learn.oop.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> participantList=new ArrayList<>();
		participantList.add("Madhura");
		participantList.add("Riya");
		participantList.add("Ram");
		participantList.add("Sita");
		participantList.add("Sam");
//		System.out.println(participantList);
		participantList.add(1,"Dhoni");
		Iterator itr=participantList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
