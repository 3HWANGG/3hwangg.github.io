package org.javaro.lecture;
import java. util. Scanner;
public class MenuDemo {
	public static void main(String[] args) {
		int menu;
		boolean check = true;
		Scanner scan = new Scanner(System.in);
		System. out.println("20221137 황은진 ");
		do {
			System.out.println("-----메뉴-----");
			System.out.println("1. 주문");
			System. out.println("2. 종료");
			System.out.println("메뉴 선택:");
			menu = scan.nextInt();
		switch (menu) {
			case 1:	
				System.out.println("1. 주문 선택하였습니다");
				break;
			case 2:
				System.out.println("2. 종료 선택하였습니다.");
				check = false;
				break;
			default:
				System.out.println("잘못된 입력함, 새로 입력하세요");
			} 
		}while(check);
		scan.close();
	}
}

