package org.javaro.lecture;

public class Ex7_1 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체");
		NavySoldier kdhong;
		kdhong = new NavySoldier("홍길동","1등병");
		System.out.println(kdhong.name);
		System.out.println(kdhong.rank);
		kdhong.setHeight("170");
		System.out.println(kdhong.getHeight());
		
		kdhong.swimming();
		kdhong.firing();

	}
}
class NavySoldier{
	String name, rank, height, weight, service;
	NavySoldier(String name, String rank){
		this.name=name;
		this.rank = rank;
	}
	void swimming() {
		System.out.println(this.name+" 잠수하기");
	}
	void firing() {
		System.out.println(this.name+" 대포발사");
	}
	void setHeight(String height) {
		this.height = height;
	}
	String getHeight() {
		return this.height;
	}
	
}


