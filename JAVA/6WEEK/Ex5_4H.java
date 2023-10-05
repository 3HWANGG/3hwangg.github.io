// Ex5_4H 배열 과제) 소수찾기(1부터 max까지 소수를 찾으시오)
package org.javaro.lecture;

public class Ex5_4H {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"배열");
		System.out.println("8.배열");
		System.out.println("소수 찾기(1부터 max값 (예 30)까지 소수를 찾으시오)");
		System.out.println("(힌트) continue문 사용");
		//2 3 5 7 11 13 17 19 23 29
		int []primenum = new int [] {2,3,5,7,11,13,17,19,23,29};
		int max = 30;
		for (int i = 1; i<=max; i++) {
			for (int j = 0; j<primenum.length; j++) {
				if (i == primenum[j]) {
					System.out.println("소수를 찾았습니다! : "+i);
				}
			}
		}
		
		
		
	}

}
