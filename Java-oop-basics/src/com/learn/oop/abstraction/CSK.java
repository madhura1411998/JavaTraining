package com.learn.oop.abstraction;

public class CSK extends IPL{
	@Override
	void play() {
		System.out.println("Csk is playing good in 2022");
	}
	public static void main(String[] args) {
		CSK obj=new CSK();
		obj.play();
	}
	
}
