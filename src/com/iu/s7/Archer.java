package com.iu.s7;

public class Archer extends Kind implements Attack  {

	@Override
	public void attack() {
		System.out.println("원거리공격");
	}
	

}
