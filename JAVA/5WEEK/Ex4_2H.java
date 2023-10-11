package org.javaro.lecture;

public class Ex4_2H {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"반복문");
		System.out.println("while문을 이용, 1부터 100까지 합을 구하시오");
		int i = 1, sum = 0;
		while(i<=100) {
			sum+=i++;
		}
		System.out.println("1부터 100까지 합="+sum);
		System.out.println("do while문을 이용, 1부터 100까지 합을 구하시오");
		i = 1; 
		sum = 0;
		do {
			sum+=i++;
		}while(i<=100);
		System.out.println("1부터 100까지 합="+sum);
	}

}
