package org.javaro.lecture;

public class Ex2_7 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		System.out.println("비트논리연산자 결과 인쇄");
		int a = 11, b = 13;
		String ba = Integer.toBinaryString(a);
		System.out.println("2진수: "+ba);
		String bb = Integer.toBinaryString(b);
		System.out.println("2진수: "+bb);
		// a&b
		String ab = Integer.toBinaryString(a&b);
		System.out.println("&연산: "+ab);
		System.out.println("& 연산자 "+(a&b));
		//a|b
		ab = Integer.toBinaryString(a|b);
		System.out.println("|연산: "+ab);
		System.out.println("| 연산자 "+(a|b));
		// a^b
		ab = Integer.toBinaryString(a^b);
		System.out.println("^연산: "+ab);
		System.out.println("^ 연산자 "+(a^b));
	}

}
