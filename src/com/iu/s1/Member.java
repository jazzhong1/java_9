package com.iu.s1;

public class Member {
	
	private String name;	//모든 맴버변수는 private로 사용한다.
	private String sex;		//getter stter는 필요한거만들면된다
	
	private int age;		//private,public을 제일 많이 쓴다
	private int weight;
	private int height;
	private int phnum;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPhnum() {
		return phnum;
	}

	public void setPhnum(int phnum) {
		this.phnum = phnum;
	}

	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member[] members) {
		this.members = members;
	}

	
	Member[] members=new Member[1];
	
	public Member(){
	}
	
	public Member(String name,String sex, int age, int weight, int height, int phnum) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.phnum=phnum;
	}
	
	
	void info(){
		
			System.out.println(name);
			System.out.println(age);
			System.out.println(sex);
			System.out.println(height);
			System.out.println(weight);
			System.out.println(phnum);
			
		
	}

}
