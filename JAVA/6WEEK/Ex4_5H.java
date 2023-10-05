// Ex4_5H 반복문 과제) 무한 반복 탈출 / for문 이용, 삼각형/ 원 출력
package org.javaro.lecture;

public class Ex4_5H {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"반복문");
		System.out.println("7.과제");
		System.out.println("무한 반복을 벗어나도록 아래 코드를 수정하시오");
		int x = 0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		System.out.println("for문을 이용, 삼각형을 출력하시오");
		final int N = 30;
		for(int i=N; i>0; i--)
		{
			for(int j =i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("for문을 이용, 원을 출력하시오.(x^2+y^2=r^2이용)");
		final int n = 15;
		for(int i=-n; i<=n; i++)
		{
			for(int j =-n; j<=n; j++) 
			{
				if(i*i+j*j <=n*n) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
