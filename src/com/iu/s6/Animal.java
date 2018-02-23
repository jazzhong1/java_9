package com.iu.s6;

public abstract class Animal {
	String name;
	int age;
	
	
	
	public Animal(){}
	
	public void t(){
		this.eat(); 				//참조변수명.메소드 이기 때문에 
	}
	
	public abstract void eat();		//파생클래스가 강제적으로 메소드를 
									//오버라이딩게 해준다,해야한다. 
									//일반 클래스안에 abstract 메소드가 하나라도있으면 오류
									//무조건 추상클래스로 선언해야한다.
	
	
	
	
}
