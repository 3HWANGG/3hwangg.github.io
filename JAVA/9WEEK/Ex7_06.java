// 객체) Ex7_06 자바빈_절차 프로그램과 객체 프로그램 비교(2/2)
package org.javaro.lecture;

public class Ex7_06 {	// 자바빈 프로그램

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체"); 
		Vadd6 add1 = new Vadd6();
		add1.setX(10.0);	// 보안 강화(private)
		add1.setY(20.0);	
		double add_value = add1.fn_add();
		System.out.println("더하기="+add_value);
	}

}
class Vadd6{
	private double x, y;
	void setX(double x) {
		this.x = x;	}
	double getX() {
		return this.x;
	}
	void setY(double y) {
			this.y = y;
		}
	double getY() {
		return this.y;
	}
	public double fn_add() {
		return this.x+this.y;
	}
}
