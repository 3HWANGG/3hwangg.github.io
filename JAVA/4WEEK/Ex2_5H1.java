package org.javaro.lecture;

public class Ex2_5H1 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		System.out.println("다음 증감 연산자의 값을 구하시오");
		int a = 10;
		a++; // a += 1; a = a + 1; 모두 동일
		System.out.println(a);	// 11
		System.out.println(++a);	// 12
		System.out.println(a++);	// 12
		
		System.out.println("나머지를 구하시오(% 모듈러 연산자 이용)");
		System.out.println(1%3);	// 1
		System.out.println(2%3);	// 2
		System.out.println(3%3);	// 0
		System.out.println(4%3);	// 1
		System.out.println(5%3);	// 2
		System.out.println(6%3);	// 0
		
	}

}
