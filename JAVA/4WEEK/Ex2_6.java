package org.javaro.lecture;

public class Ex2_6 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		System.out.println("논리연산자 결과 인쇄");
		
		System.out.println("(2>2) && (4>3) 결과="+((2>2) && (4>3)));	// false
		System.out.println("(2<2) && (4<3) 결과="+((2<2)&&(4<3)));	// false
		System.out.println("(2>2) || (4>3) 결과="+((2>2)||(4>3)));	// true
		System.out.println("(2<2) || (4<3) 결과="+((2<2)||(4<3)));	// false
		System.out.println("!(2==3) 결과="+!(2==3));	// true
		System.out.println("!(2!=3) 결과="+!(2!=3));	// false
		
		boolean flag;
		flag = (3>2) && (2==3);
		System.out.println(flag); //false
	}

}
