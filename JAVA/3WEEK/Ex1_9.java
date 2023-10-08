package org.javaro.lecture;
import java.util.*;
public class Ex1_9 {
	static double PI = 3.141592;
	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"변수");
		int r = 15;	// int 정수형 , 이름:5, 15대입
		System.out.println("원주율"+PI+", 반지름 "+r+"cm인 원의 둘레는 "+2*PI*r+ "cm 입니다");
		System.out.println("2진수: "+Integer.toBinaryString(r));
		System.out.println("8진수: "+Integer.toOctalString(r));
		System.out.println("16진수: "+Integer.toHexString(r));
		double rd = 15.3; // double 실수형, 이름: rd, 15.3대입
		System.out.println("원주율"+PI+ ", 반지름"+r+"cm인 원의 면적은 "+r*PI*r+"cmcm입니다");
	}

}
