package com.learn.oop.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tommorow=date.plusDays(1);
		LocalDateTime time=LocalDateTime.now();

		System.out.println("Date : "+date);
		System.out.println("Yesterday's date is : "+yesterday);
		System.out.println("Tommorow's date is : "+tommorow);
		System.out.println("Time : "+time);
	}
}
