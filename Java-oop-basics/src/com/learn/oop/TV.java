package com.learn.oop;

public class TV {
	
	String brand;
	String modelName;
	Integer screenSize;
	Integer price;
	String color;
	String displayType;

	public static void main(String[] args) {
		TV lgOled=new TV();
		TV samsungFrame =new TV();
		lgOled.brand="LG";
		lgOled.modelName="4K oled 75' TV";
		lgOled.screenSize=75;
		lgOled.price=10000;
		lgOled.color="black";
		lgOled.displayType="OLED";
		System.out.println(lgOled.brand+" "+lgOled.modelName);
	}
}
