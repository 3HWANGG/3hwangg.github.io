package org.javaro.lecture;

public class Ex4_1 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"반복문");
		int x = 11;	// 초기값
		int End = 15;	// 종료조건
		while(x<=End) {
			System.out.println("x="+x+",End="+End+","+(x<=End));
			x = x+1;	// 조건식 변화
		}

	}

}
