package com.iu.s5;

public class Customer {

	private int don;
	private int point;

	Computer computer;
	Tv tv;
	Phone phone;

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

	// 물건을 여러개 계산 메서드
	//

	public void buy(Product[] products) {
		// 물건값 계산
		// 포인트 계산

		for (int i = 0; i < products.length; i++) {

			this.don = this.don - products[i].getPrice();
			this.point = this.point + products[i].getPoint();
			System.out.println("현재 남은 돈:" + don);
			System.out.println("현재 포인트:" + point);
		}
	}

	public void buy(Product product) {
		// 물건값 계산
		// 포인트 계산

		this.don = this.don - product.getPrice();
		this.point = this.point + product.getPoint();
		// instnaceof=연산자 boolean리턴
		// 해당 참조변수가 어떤 클래스타입인지 판별
		// web, 프레임워크가면 알아서 형변환 해준다

		if (product instanceof Computer) {
			Computer computer = (Computer) product;
			System.out.println(computer.getCpu());
			System.out.println(computer.getWeight());
		} else if (product instanceof Tv) {
			Tv tv = (Tv) product;
			System.out.println(tv.getBrind());
			System.out.println(tv.getSize());
		} else if (product instanceof Phone) {
			Phone phone = (Phone) product;

			System.out.println(phone.getBrand());
			System.out.println(phone.getColor());
		}

		System.out.println("현재 남은 돈:" + don);
		System.out.println("현재 포인트:" + point);

	}

}
