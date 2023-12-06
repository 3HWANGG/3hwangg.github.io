package org.javaro.lecture;

import java.util.*;  // java.util 패키지 import

public class Ex12_2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");	// 에러 발생하지 않음
		for(int i = 0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}

}
