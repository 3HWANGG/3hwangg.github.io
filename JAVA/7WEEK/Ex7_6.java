package org.javaro.lecture;

public class Ex7_6 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체");
		Dist dist1 = new Dist(10,30,20,60);
		double c = dist1.dLength();
		System.out.println("두 점사이 거리는"+c);
		Dist dist2 = new Dist(15,35,55,65);
		c = dist2.dLength();
		System.out.println("두 점사이 거리는"+c);
		

	}

}
class Dist{
	int x1, y1, x2, y2;
	
	Dist(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double dLength() {
		return Math.sqrt((this.x2-this.x1)*(this.x2-this.x1)+(this.y2-this.y1)*(this.y2-this.y1));
	}

	
}
