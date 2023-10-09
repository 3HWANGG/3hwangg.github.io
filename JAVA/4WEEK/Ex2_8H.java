package org.javaro.lecture;

public class Ex2_8H {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		System.out.println("다음 값을 구하시오");
		int a = 100, b = 100;
		System.out.println("a와 b는 같은 크기? "+(a==b));	// true
		System.out.println("a가 b보다 큰가요? "+(a>b));	// false
		System.out.println("a=b이고 a>30인가요? "+((a==b)&&(a>b)));	// false
		System.out.println("a가 50이 아닌가요? "+!(a==50));	// true
		
		System.out.println("삼항연산자 값을 구하시오((a>b)?a:b 활용)");
		a = 100;
		b = 50;
		System.out.println("a>b? "+((a>b)?a:b)); // true면 a, false면 b, 100
		
		System.out.println("거듭제곱 연산자(Math.pow()활용)");
		double a1 = Math.pow(2.0, 32.0);	//2.0의 32제곱
		System.out.println("2.0의 32.0 제곱은 "+(int)a1+"입니다");// 인쇄
		
		System.out.println("x=6, y=7일때, 다음의 논리 결과값을 쓰시오");
		int x = 6, y = 7;
		System.out.println("!(x>6) 결과= "+!(x>6));	// true
		System.out.println("(x==6 && x==5) 결과= "+(x==6 && x==5));	// false
		System.out.println("(x==6 || x==5) 결과= "+(x==6 || x==5));	// true
		System.out.println("(x>-1 && y<10) 결과= "+(x>-1 && y<10));	// true
		System.out.println("(x>10 && x<5) 결과= "+(x>10 && x<5));	// false
		
	}

}
