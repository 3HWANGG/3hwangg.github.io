package org.javaro.lecture;

public class Ex6_10 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"함수");
		double x, y; // 값 1, 값
		
		x = 10.0;
		y = 20.0;
		double mult_value = fn_mult(x,y);
		
		System.out.println("곱하기="+mult_value);

	}
	public static double fn_mult(double x, double y)
	{
		double result;
		result = x*y;
		return result;
	}

}
