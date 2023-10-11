package org.javaro.lecture;

public class Ex3_7H {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"조건문");
		System.out.println("6.조건문-과제");
		System.out.println("if조건문을 이용, 입력문자에 따라, 다른 메시지를 출력하는 프로그램");
		String gender="Male";	// 외부 입력 가능
		if(gender =="Male")// if(gender.equals("Male")) 사용 가능
		{
			System.out.println("남자");
		}
		else {
			System.out.println("남자아님");
		}
		System.out.println("String class");
		if(gender.equalsIgnoreCase("male")) {
			System.out.println("남자");
		}
		else {
			System.out.println("남자아님");
		}
		System.out.println("switch/case를 사용하여 위 예제와 같은 결과를 제시하시오.");
		switch(gender) {
		case "Male":
			System.out.println("남자");
			break;
		default:
			System.out.println("남자아님");
			
		}

	}

}
