package com.iu.s2;

public class Point {
	
	//접근지정자를 안쓰면 default로 자동 선언
	
	 private int num;	//보통 private로 다른 패키지나 다른 클래스에서 선언하지 못하게 사용
	 private String name;	//public인 메서드나 메소드를 이용해서 접근한다.
	 						//getter,setter
	 
	
	 
	 public void info(){
		 System.out.println(num);
		 System.out.println(name);
	 }
	 
	 public void setNum(int num){
		 //나이의 범위를 체크해준다. 보통 이렇게 많이사용
		 
		 if(num>0&&num<100){
			 this.num=num;
		 }
		 else
			 num=0;
	 }
	 
	 public int getNum(){
		 return this.num;
	 }
	 
	 public void setName(String name) {
		this.name = name;
	}
	 public String getName() {
		 if (this.name==null) {
			 return "영희";
		}
		 else{
			 return this.name;
		 }
	}
	
}
