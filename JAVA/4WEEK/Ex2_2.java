package org.javaro.lecture;
import java.math.BigDecimal;
public class Ex2_2 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		float a = 3.5f;
		float b = 2.1f;
		BigDecimal bda = new BigDecimal(String.valueOf(a));	// BigDecimal클래스이용 초기값a인 bda객체생성
		BigDecimal bdb = new BigDecimal(String.valueOf(b));
		bda = bda.add(bdb);	// a = a+2.1f;	// bda 객체가 해당 클래스의 add()메소드를 호출
		System.out.println("a=3.5f; a=a+2.1; a=" + bda.toString());	// bda 객체가 tostring() 호출 // 값을 문자열로 변환
		bda = bda.add(bdb);	// a +=b;
		System.out.println("a=5.6; a=a+2.1; a=" + bda.toString());	
		bda = bda.subtract(bdb);	// a -=b;
		System.out.println("a=7.7; a=a-2.1; a=" + bda.toString());	
		int c = 2;
		BigDecimal bdc = new BigDecimal(String.valueOf(c));
		bda = bda.multiply(bdc);	// a *=2;
		System.out.println("a=5.6; a=a*2; a=" + bda.toString());	
		bda = bda.divide(bdc);	// a /=2;
		System.out.println("a=11.2; a=a/2; a=" + bda.toString());	
		bda = bda.remainder(bdc);	// a %=2;
		System.out.println("a=5.6; a=a%2; 나머지=" + bda.toString());	// 나머지 = 1.6

 	}

}
