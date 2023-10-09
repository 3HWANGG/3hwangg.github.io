package org.javaro.lecture;

public class Ex2_4 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		System.out.println("++b, d++ 인쇄");
		int a, b = 1;
		a = ++b;
		System.out.println("전치: a="+a+", b="+b); // 2
		int c, d = 1;
		c = d++;
		System.out.println("후치: c="+c+", d="+d); // 1
	}

}
