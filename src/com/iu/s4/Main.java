package com.iu.s4;

public class Main {
	public static void main(String[] args) {
		
		Tv t= new Tv();
		t.setBrind("LG");
		t.setSize(100);
		t.setPrice(1000);
		t.setPoint(100);
		
		Computer computer= new Computer();
		computer.setCpu("i7");
		computer.setWeight(0.99);
		computer.setPrice(120);
		computer.setPoint(100);
		
		Phone phone=new Phone();
		phone.setBrand("삼성");
		phone.setColor("검정");
		phone.setPoint(100);
		phone.setPrice(100);
		
		Customer iu=new Customer();
		iu.setDon(2000);
		iu.setPoint(0);
		
		iu.buy(computer);
		
		
		
	}
}
