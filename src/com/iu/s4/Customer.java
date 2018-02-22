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
	
	public void buy(int price, int point){
		this.don=this.don-price;
		this.point=this.point-point;

		System.out.println("현재 남은 돈:" + don);
		System.out.println("현재 포인트:" + point);
	}
	

	

	public void buy(Computer computer) {
		// 물건값 계산
		// 포인트 계산
		this.don = this.don - computer.getPrice();
		this.point = this.point + computer.getPoint();
		
		System.out.println("cpu:"+computer.getCpu());
		System.out.println("무게"+computer.getWeight());
		System.out.println("현재 남은 돈:" + don);
		System.out.println("현재 포인트:" + point);

	}

	public void buy(Phone phone) {
		// 물건값 계산
		// 포인트 계산
		this.don = this.don - phone.getPrice();
		this.point = this.point + phone.getPoint();

		System.out.println("색상:"+phone.getColor());
		System.out.println("브랜드:"+phone.getBrand());
		System.out.println("현재 남은 돈:" + don);
		System.out.println("현재 포인트:" + point);

	}

	public void buy(Tv tv) {
		// 물건값 계산
		// 포인트 계산
		
		this.don = this.don - tv.getPrice();
		this.point = this.point + tv.getPoint();
		System.out.println("브랜드:"+tv.getBrind());
		System.out.println("사이즈:"+tv.getSize());
		System.out.println("현재 남은 돈:" + don);
		System.out.println("현재 포인트:" + point);

	}

}
