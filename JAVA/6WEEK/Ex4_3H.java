package org.javaro.lecture;

public class Ex4_3H {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"반복문");
		System.out.println("7.과제");
		System.out.println("for문을 이용하여, 1부터 100까지 합을 구하시오");
		int End = 100, sum = 0; // 종료 조건
		for (int x = 1; x <=End; x++) {
			sum+=x;
		}
		System.out.println("1부터 100까지 합: "+sum);
		System.out.println("while과 비교");
		int i =1;
		sum = 0;
		while(i<=End) {
			sum+=i;
			i++;
		}
		System.out.println("while 1부터 100까지 합: "+sum);
		System.out.println("do while과 비교");
		i =0;
		sum = 0;
		do{
			sum+=i;
			i++;
		}while(i<=End);
		System.out.println("do while 1부터 100까지 합: "+sum);
		
	}

}
