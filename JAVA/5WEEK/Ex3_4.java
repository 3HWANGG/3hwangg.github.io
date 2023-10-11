package org.javaro.lecture;

public class Ex3_4 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"조건문");
		int x = 5;
		System.out.println("초기 x = "+x);
		if(x==5) {
			x = 6;	// x에 6 대입
		}
		System.out.println("바뀐 x ="+x);
		if(x==6) {
			x = 5;	// x에 5 대입
		}
		System.out.println("다시 바뀐 x ="+x);
	}

}
