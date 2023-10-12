package org.javaro.lecture;

public class Ex7_4 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체"); 
		Dist4 dist1 = new Dist4();
		dist1.setX1(10); dist1.setY1(30);	// 보안강화
		dist1.setX2(20); dist1.setY2(60);
		double c = dist1.dLength();
		System.out.println("두 점사이 거리는"+c);

	}

}
class Dist4{
	private int x1, y1, x2, y2;
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public double dLength() {
		return Math.sqrt((this.x2-this.x1)*(this.x2-this.x1)+(this.y2-this.y1)*(this.y2-this.y1));
	}

	
}
