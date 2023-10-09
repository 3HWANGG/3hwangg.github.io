package org.javaro.lecture;

public class Ex2_1 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		float a = 3.5f;
		a = a+ 2.1f;
		System.out.println("a=3.5; a=a+2.1; a="+a);
		a +=2.1;
		System.out.println("a=5.6; a=a+2.1; a="+a);
		a -= 2.1;
		System.out.println("a=7.7; a=a-2.1; a="+a);
		a *=2;
		System.out.println("a=5.6; a=a*2; a="+a);
		a /= 2;
		System.out.println("a=11.2; a=a/2; a="+a);
		a %=2;
		System.out.println("a=5.6; a=a%2; 나머지="+a);	// 나머지 = 1.5999999
	}

}
