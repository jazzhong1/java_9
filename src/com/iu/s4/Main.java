package com.iu.s4;

public class Main {

	public static void main(String[] args) {		
		//메인메서드의 역할은 프로그램실행역할이다. 위치가 정해져 있는것은 아니다.
		
//		Point p1=new Point();
//		p1.num2=3;
		
//		Point p2=new Point();
//		p2.num2=30;
		
		
		
		//static 사용방법
		//클래스 변수,클래스 메서드 사용공식
		//클래스 명.변수명
		//클래스 명.메소드명();
		
		
		Point point=new Point();
		Point2 point2=new Point2();
		point2.info();
		System.out.println(point.x);
		System.out.println(point2.x);
		System.out.println(point2.Y);
		
		
	
	}
}
