// Ex6_3H 함수 과제) Ex 6-3 반환값 타입 String으로 변환
package org.javaro.lecture;

public class Ex6_3H {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"함수");
		System.out.println("9.함수");
		System.out.println("반환값이 없었던 Ex6_3.java를 수정하여 반환값 타입 String을");
		System.out.println("이용하여 동일한 결과가 생성되도록 코딩하시오.");
		String gender="female";
		System.out.println(fnGender(gender));
		gender="male";
		System.out.println(fnGender(gender));
	}
	static String fnGender(String gender) {
		if(gender=="female") {
			gender = "여자";
			return gender;
		}else if (gender=="male") {
			gender = "남자";
			return gender;
		}
		return gender;
	}

}
