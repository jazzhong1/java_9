package com.iu.s4;

public class Customer {

	private int don;
	private int point;
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	public void buy(){
		//물건값 계산
		//포인트 계산
		System.out.println("현재 남은 돈:"+don);
		System.out.println("현재 포인트:"+point);
		
	}
	public void buy(Computer computer){
		//물건값 계산
		//포인트 계산
		this.don=this.don-computer.getPrice();
		this.point=this.point+computer.getPoint();
		
		System.out.println("현재 남은 돈:"+don);
		System.out.println("현재 포인트:"+point);
		
	}
	public void buy(Phone phone){
		//물건값 계산
		//포인트 계산
		this.don=this.don-phone.getPrice();
		this.point=this.point+phone.getPoint();
		
		System.out.println("현재 남은 돈:"+don);
		System.out.println("현재 포인트:"+point);
		
	}
	public void buy(Tv tv){
		//물건값 계산
		//포인트 계산
		this.don=this.don-tv.getPrice();
		this.point=this.point+tv.getPoint();
		
		System.out.println("현재 남은 돈:"+don);
		System.out.println("현재 포인트:"+point);
		
	}
	

}
