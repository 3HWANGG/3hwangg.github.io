// Ex6_3 함수) 반환값 및 반환 형식
package org.javaro.lecture;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"함수");
		String gender="female";
		fnGender(gender);
		gender="male";
		fnGender(gender);
	}
	static void fnGender(String gender) {
		if(gender=="female") {
			System.out.println("여자");
		}else if (gender=="male") {
			System.out.println("남자");
		}
	}

}
