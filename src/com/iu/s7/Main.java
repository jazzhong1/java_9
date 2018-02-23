package com.iu.s7;

public class Main {
	public static void main(String[] args) {
		
		Archer archer=new Archer();
		Magician magician=new Magician();
		Warrior warrior=new Warrior();
		
		Npc npc=new Npc();
		
		archer.attack();
		magician.attack();
		warrior.attack();
		
	}
}
