// 객체) Ex7_H 절차 프로그램과 객체 프로그램 비교_ 곱하기,4각형 면적, 3각형 면적 문제를 대상으로 다음을 작성하시오(절차/함수/객체/자바빈)
package org.javaro.lecture;
public class Ex7_H {
	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체"); 
		System.out.println("10.객체");
		System.out.println("절차 프로그램과 객체 프로그램 비교");
		System.out.println("곱하기, 4각형 면적, 3각형 면적 문제를 대상으로 다음을 작성하시오");
		System.out.println("절차 프로그램 / 함수 프로그램 / 객체 프로그램 / 자바빈 프로그램");
		double x,y; //값1(밑변), 값2(높이)
		x = 10.0;
		y = 20.0;
		double mult_value = x*y;
		System.out.println("1.절차 프로그램 곱하기="+mult_value);
		mult_value = fn_mult(x,y);
		System.out.println("2.함수 프로그램 곱하기="+mult_value);
		C_mult mult = new C_mult();
		mult.x = 10.0;
		mult.y = 20.0;
		mult_value = mult.result_mult();
		System.out.println("3.객체 프로그램 곱하기="+mult_value);
		J_mult mult_J = new J_mult();
		mult_J.setX(10.0);
		mult_J.setY(20.0);
		mult_value = mult_J.Jresult_mult();
		System.out.println("4.자바빈 프로그램 곱하기="+mult_value);
		System.out.println(""); 
		
		double area4_value = x*y;
		System.out.println("1.절차 프로그램 4각형 면적="+area4_value);
		area4_value = fn_4area(x,y);
		System.out.println("2.함수 프로그램 4각형 면적="+area4_value);
		C_4area area4 = new C_4area();
		area4.x = 10.0;
		area4.y = 20.0;
		area4_value = area4.result_4area();
		System.out.println("3.객체 프로그램 4각형 면적="+area4_value);
		J_4area area4_J = new J_4area();
		area4_J.setX(10.0);
		area4_J.setY(20.0);
		area4_value = area4_J.Jresult_4area();
		System.out.println("4.자바빈 프로그램 4각형 면적="+area4_value);
		System.out.println(""); 
		
		double area3_value = 0.5*x*y;
		System.out.println("1.절차 프로그램 3각형 면적="+area3_value);
		area3_value = fn_3area(x,y);
		System.out.println("2.함수 프로그램 3각형 면적="+area3_value);
		C_3area area3 = new C_3area();
		area3.x = 10.0;
		area3.y = 20.0;
		area3_value = area3.result_3area();
		System.out.println("3.객체 프로그램 3각형 면적="+area3_value);
		J_3area area3_J = new J_3area();
		area3_J.setX(10.0);
		area3_J.setY(20.0);
		area3_value = area3_J.Jresult_3area();
		System.out.println("4.자바빈 프로그램 3각형 면적="+area3_value);
	}
	public static double fn_mult(double x, double y) 
	{	// 곱하기 함수
		double result;
		result = x*y;
		return result;
	}
	public static double fn_4area(double x, double y)
	{	// 4각형 면적 함수
		double result;
		result = x*y;
		return result;
	}
	public static double fn_3area(double x, double y)
	{	// 3각형 면적 함수
		double result;
		result = 0.5*x*y;
		return result;
	}
}
class C_mult{	// 곱하기 객체
	double x, y;
	C_mult(){
	}
	public double result_mult() {
		return this.x*this.y;
	}
}
class C_4area{	// 4각형 면적 객체
	double x, y;
	C_4area(){
	}
	public double result_4area() {
		return this.x*this.y;
	}
}
class C_3area{	// 3각형 면적 객체
	double x, y;
	C_3area(){
	}
	public double result_3area() {
		return 0.5*this.x*this.y;
	}
}
class J_mult{	// 곱하기 자바빈
	private double x, y;
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double Jresult_mult() {
		return this.x*this.y;
	}
}
class J_4area{	// 4각형 면적 자바빈
	private double x, y;
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double Jresult_4area() {
		return this.x*this.y;
	}
	
}
class J_3area{	// 3각형 면적 자바빈
	private double x, y;
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double Jresult_3area() {
		return 0.5*this.x*this.y;
	}
	
}
