// 객체) Ex7_5 객체_절차 프로그램과 객체 프로그램 비교(2/2)
package org.javaro.lecture;

public class Ex7_5 {	// 객체프로그램

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체"); 
		Vadd5 add1 = new Vadd5();
		add1.x=10.0;	// 보안 취약
		add1.y=20.0;
		double add_value =add1.fn_add();
		System.out.println("더하기="+add_value);
	}

}
class Vadd5{
	double x,y;
	Vadd5(){	// 생략가능
	}
	public double fn_add()
	{
		double result;
		result = this.x+this.y;
		return result;
	}
	
}
