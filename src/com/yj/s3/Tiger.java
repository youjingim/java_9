package com.yj.s3;

public class Tiger extends Animal{

	@Override
	public void eat() {
		System.out.println("으렁");
	}
	
	//1. 오버라이딩 할 메서드명을 알고 있을 때 
	/*@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}*/

	
	//2. 메서드명을 모르거나 많은 양의 메서드를 오버라이딩 해야할 때
}
