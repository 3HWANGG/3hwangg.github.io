package org.javaro.lecture;

public class Ex6_4 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"함수");
		double x,y,area; //밑변, 높이, 면적
		int idx;	// idx ==1 직4각형, idx ==2 3각형
		x = 10;
		y = 20;
		idx =1;	// 직4각형
		area = fn_area(idx,x,y);
		System.out.println("4각형 면적="+area);
		idx =2;	// 3각형
		area = fn_area(idx, x, y);
		System.out.println("3각형 면적="+area);
		
	}
	static double fn_area(int a, double b, double c) {	// main()메소드와 같은 오브젝트 내의 메소드에는 static 붙임
		double result = 0;
		if(a==1) {
			result = b*c;
		}else if (a==2) {
			result = 0.5*b*c;
		}
		return result;
	}

}
