package org.javaro.lecture;

public class Ex3_4H2 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"조건문");
		System.out.println("6.조건문-과제2");
		System.out.println("조건문(if)을 이용, 어떤 문자열이 특정 문자열을 포함하는지 확인");
		String strLove = "I Love java.";
		if(strLove.contains("java"))	// String 클래스의 method 확인
		{
			// 포함하는 경우
			System.out.println("Yes, java");	// true
			
		}
		else
		{
			// 포함하지 않는 경우
			System.out.println("No, java");		// false
		}

	}

}
