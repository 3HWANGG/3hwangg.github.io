package org.javaro.lecture;
import java.util.*;
public class Ex1_8 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"변수");
		System.out.println("chat 아스키 인쇄");
		for(char i ='a'; i<='z'; i++) {
			System.out.print(i+",");
		}
		System.out.println("\n"+"진수 변환");
		int a = 100;
		System.out.printf("10진수: %010d\n", a);
		System.out.format("8진수: %010o\n", a);
		System.out.format("16진수: %010x\n", a);
		String b = Integer.toBinaryString(a);
		System.out.println("2진수: "+Integer.toBinaryString(a));
		System.out.println("2진수 10자리:"+String.format("%010d",Integer.parseInt(Integer.toBinaryString(a).toString())));
		System.out.println("2진수를 10진수로 "+Integer.parseInt(b, 2));
		System.out.println("substring()이용한 문자열 자르기");
		String name = "Steve Jobs";
		System.out.println(name);
		System.out.println(name.substring(0,2));
		System.out.println(name.substring(5,7));
		System.out.println(name.substring(3,10));
	}
}
