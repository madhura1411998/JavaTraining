package com.learn.oopp.encapsulation;

public class Yamaha {
	public static void main(String[] args) {
		Bike fz= new Bike();
		fz.setName("YamahaFZ");
		fz.setCc(150);
		fz.setColor("Blue");
		fz.setPrice(90000);
		System.out.println(fz.getName());
	}
}
