// Ex4_5 반복문) continue
package org.javaro.lecture;

public class Ex4_5 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"반복문");
		int b =2;
		for(int i =0; i< 5; i++) {
			if(i==b) {
				continue;	// i값이 2까지만 반복
			}
			System.out.println("i="+i);
		}

	}

}
