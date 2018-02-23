package com.iu.s1;


public class Main {
	
	public static void main(String[] args) {
		System.out.println("비만도 측정프로그램");
		
		Member member= new Member();
	
		InBody inBody=new InBody();
		member.info();
		inBody.check(member);
		
		
		
		
			
		
//			result=inBody.check();
		
		
		
		
	}
	
	


}
