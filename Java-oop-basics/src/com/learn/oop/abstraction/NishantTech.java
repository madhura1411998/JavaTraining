package com.learn.oop.abstraction;

public class NishantTech implements ITCompanies{

	@Override
	public void working() {
		System.out.println("Nishant tech is working");
	}
	public static void main(String[] args) {
		NishantTech ns=new NishantTech();
		ns.working();
	}

}
