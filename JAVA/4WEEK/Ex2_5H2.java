package org.javaro.lecture;

public class Ex2_5H2 {

	public static void main(String[] args) {
				System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
				System.out.println("다음 논리를 프로그램으로 작성하고 실행하시오.");
				boolean flag;
				int b = 3;
				flag = (3>b);
				System.out.println("3>b 불리언 변수 flag="+flag); // false
				flag = (4<b);
				System.out.println("4<b 불리언 변수 flag="+flag); // false
				flag = (4>=b);
				System.out.println("4>=b 불리언 변수 flag="+flag); // true
				flag = (3<=b);
				System.out.println("3<=b 불리언 변수 flag="+flag); // true
				flag = (4==b);
				System.out.println("4==b 불리언 변수 flag="+flag); // false
				flag = (4!=b);
				System.out.println("4!=b 불리언 변수 flag="+flag); // true

	}

}
