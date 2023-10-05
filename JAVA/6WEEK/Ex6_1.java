// Ex6_1 함수) 함수
package org.javaro.lecture;

public class Ex6_1 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"함수");
		int d = sum(1,2,3);					// 함수 호출
		System.out.println("d = "+d);
	}
	static int sum(int a, int b, int c) {	// 함수 생성
		int total = a+b+c;
		return total;
	}

}
