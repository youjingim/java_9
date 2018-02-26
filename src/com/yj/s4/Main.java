package com.yj.s4;

public class Main {
	public static void main(String[] args) {
		Magic m = new Magic();
		m.name = "마법사";
		m.level = 16;
		m.hp = 100;
		m.mp = 200;
		System.out.println(m.name);
		System.out.println(m.level);
		System.out.println(m.mp);
		System.out.println(m.hp);
		m.Attack();
		
		Knight n = new Knight();
		n.name = "기사";
		n.level = 15;
		n.mp = 1000;
		n.hp = 500;
		System.out.println(n.name);
		System.out.println(n.level);
		System.out.println(n.mp);
		System.out.println(n.hp);
		n.Attack();
		
		Npc p = new Npc();
		
		p.name = "김희진";
		p.level = 90;
		p.hp = 1000;
		p.mp = 500;
		
		System.out.println(p.name);
		System.out.println(p.level);
		System.out.println(p.mp);
		System.out.println(p.hp);
				
		
	}

}
