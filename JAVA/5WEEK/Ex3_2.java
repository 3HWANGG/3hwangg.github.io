package org.javaro.lecture;

public class Ex3_2 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"조건문");
		int score = 85;
		if(score>=90) {
			System.out.println("A학점입니다");
		}
		else if(score<90 && score>= 80)	// score가 80점 이상이고, 90점 미만인 경우
		{
			System.out.println("B학점입니다");
		}
		else if(score<80 && score>= 70)	
		{
			System.out.println("C학점입니다");
		}
		else if(score<90 && score>= 80)	
		{
			System.out.println("D학점입니다");
		}
		else {
			System.out.println("F학점입니다");
		}

	}

}
