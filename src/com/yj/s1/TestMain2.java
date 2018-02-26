package com.yj.s1;

public class TestMain2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.a=10;
		c.b=20;
		c.p1();
		c.c();
		
		Parent p = new Parent();
		p.a = 10;
		p.p1();
		
		Parent p2 = c;
		p2.a = 1;
		p2.p1();
		c.p1();
		c.c();
		//p2.b;
		//p2.c();
		
		
	}

}
