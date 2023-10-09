package org.javaro.lecture;
import java.math.BigDecimal;
public class Ex2_3 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"연산자");
		float a;
		float b = 2.1f;
		int c = 2;
		a = b+c;	// a=b+c;
		System.out.println("b=2.1f; c=2; a=b+c=" + a);
		a = b-c;	// a=b-c;
		System.out.println("b=2.1f; c=2; a=b+c=" + a);	//0.09999905
		a = b*c;	// a=b*c;
		System.out.println("b=2.1f; c=2; a=b*c=" + a);
		a = b/c;	// a=b/c;
		System.out.println("b=2.1f; c=2; a=b/c=" + a);
		a = b%c;	// a=b%c;
		System.out.println("b=2.1f; c=2; a=b%c=" + a);	// 0.09999905
	
	}

}
