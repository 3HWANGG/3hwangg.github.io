package org.javaro.lecture;

public class Ex3_6 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"조건문");
		// 문자열
		String country="Korea";	// 외부 문자열입력 응용
		switch(country) {
		case "Korea":
			System.out.println("한국입니다");
			break;
		case "USA":
			System.out.println("미국입니다");
			break;
		case "Japan":
			System.out.println("일본입니다");
			break;
		case "China":
			System.out.println("중국입니다");
			break;
		default:
			System.out.println("국가가 아닙니다");
		}

	}

}
