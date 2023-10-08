package org.javaro.lecture;
import java.util.*;
public class Ex1_6 {
	final static int INT_MAX = 2147483647;	// int타입 수 최대값을 INT_MAX final 변수이용 상수화
	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"변수");
		int a = INT_MAX+1;
		System.out.println("int 정수 최대값 2147483647 +1? "+a+" 오버플로우 발생");
		float b = 10.6f;
		// int c = b; --> 에러 발생
		int c = (int)b;	// 강제적 형변환 추진
		System.out.println("float 원래값="+b+"을 int로 강제적 형변환하면 "+c);
		int d = (int)(b+0.5);	// 형변환을 이용한 반올림
		System.out.println("float 원래값="+b+"를 int로 강제적 형변환으로 반올림하면 "+d);
		long e = (long)INT_MAX+1;	// 암묵적 형변환
		System.out.println("INT_MAX 원래값"+INT_MAX+"에 1을 더하여 강제적 형변환하면 "+e);
	}

}
