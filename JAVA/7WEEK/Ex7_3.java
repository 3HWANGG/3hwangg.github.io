package org.javaro.lecture;

public class Ex7_3 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체");
		Dist3 dist1 = new Dist3();
		dist1.x1 = 10; dist1.y1 = 30;	// 보안 취약
		dist1.x2 = 20; dist1.y2 = 60;
		double c = dist1.dLength();
		System.out.println("두 점사이 거리는"+c);
	}

}
class Dist3{
	int x1, y1, x2, y2;
	Dist3(){	// 생략가능
	}
	public double dLength() {
		return Math.sqrt((this.x2-this.x1)*(this.x2-this.x1)+(this.y2-this.y1)*(this.y2-this.y1));
	}
}
