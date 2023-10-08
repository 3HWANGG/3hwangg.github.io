package org.javaro.lecture;
import java.util.*;
public class Ex1_5 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"변수");
		int count = 0;	// int 정수형, 이름: count, 0 대입
		char letter='a';	// 문자형, 이름:letter, 'a'대입
		double d=123.45;	// double형 실수, 이름: d, 123.45 대입
		boolean happy=false;	// boolean형. 이름: happy, false 대입
		float x = 4.1f;	//float형 실수 변수, 이름: x, 4.1f 대입
		float y;	// float형 변수, 이름:y
		y = x+5.2f; //이전에 선언된 y에 x+5.2f 대입
		double z=x*y+15.01;	// double형 실수 변수, 이름: z,x*y+15.01 대입
		System.out.println("변수 타입별 테스트");
		System.out.println(count+" "+letter+" "+happy);
		System.out.println(x+" "+y+" "+z);

	}
}
