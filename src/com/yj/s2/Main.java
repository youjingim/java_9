package com.yj.s2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		t.setBrand("LG");
		t.setSize(100);
		t.setPrice(1000);
		t.setPoint(100);
		Computer computer = new Computer();
		computer.setCpu("i7");
		computer.setMuge(0.99);
		computer.setPrice(120);
		computer.setPoint(80);
		Phone phone = new Phone();
		phone.setBrand("apple");
		phone.setColor("gold");
		phone.setPrice(150);
		phone.setPoint(50);
		Customer heejin = new Customer();
		heejin.setDon(2000);
		heejin.setPoint(0);
		
		Product [] products = new Product[2];
		products[0] = computer;
		products[1] = phone;
		
		heejin.buy(products);
	}

}
