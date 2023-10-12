package org.javaro.lecture;

public class Ex7_2 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체");
		String name, rank, height, weight, service;
		name = "홍길동";
		rank = "1등병";
		System.out.println(name);
		System.out.println(rank);
		height = "170";
		System.out.println(height);
		swimming(name);
		firing(name);
	}
	static void swimming(String name) {
		System.out.println(name+" 잠수하기");
	}
	static void firing(String name) {
		System.out.println(name+" 대포발사");
	}

}
