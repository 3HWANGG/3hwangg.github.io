// Ex5_3 다차원 배열) 요소수가 다른 다차원 배열
package org.javaro.lecture;

public class Ex5_3 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"배열");
		int b00 = 8; int b01=5; int b02 = 2; int b03=3; int b04=6;
		int b10 = 5; int b11=4; int b12 = 1;
		System.out.println("동일타입변수0="+b00+","+b01+","+b02+","+b03+","+b04);
		System.out.println("동일타입변수1="+b10+","+b11+","+b12);
		int [][]b = new int [][] {{8,5,2,3,6},{5,4,1}};
		System.out.println("동일타입배열0="+b[0][0]+","+b[0][1]+","+b[0][2]+","+b[0][3]+","+b[0][4]);
		System.out.println("동일타입배열1="+b[1][0]+","+b[1][1]+","+b[1][2]);
		System.out.print("동일타입배열0=");
		for (int i=0; i<b[0].length;i++) {
			System.out.print(b[0][i]+" ");
		}
		System.out.println("");
		System.out.print("동일타입배열1=");
		for (int i=0; i<b[1].length;i++) {
			System.out.print(b[1][i]+" ");
		}
		System.out.println("");
		//for(int i=0; i<b.length;i++){
		//	for(int j=0; j<b[i].length;j++) System.out.print(b[i][j]+" ");
		//}

	}

}
