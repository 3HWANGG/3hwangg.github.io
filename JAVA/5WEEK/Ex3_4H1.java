package org.javaro.lecture;

public class Ex3_4H1 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"조건문");
		System.out.println("6.조건문-과제1");
		System.out.println("if조건문을 이용, 점수에 따라 학점을 출력하는 프로그램");
		int score = 90;
		if (score >= 90) {
			System.out.println("학점=A");
		}
		else if(score >= 80) {
			System.out.println("학점=B");
		}
		else if(score >= 70) {
			System.out.println("학점=C");
		}
		else {
			System.out.println("학점=F");
		}
		
	}

}
