package org.javaro.lecture;
import java.util.Scanner;
public class Ex13_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개:1, 고양이:2 ?");
		int select = sc.nextInt();
		Animal animal;	// 동물로 선언
		if (select == 1) {
			animal = new Dog();	// 개로 할당
			animal.eat();
		}else if(select ==2) {
			animal = new Cat();	// 고양이로 할당
			animal.eat();
		}
		sc.close();
	}

}
