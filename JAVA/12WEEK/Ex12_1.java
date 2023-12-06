package org.javaro.lecture;
import java.util.*;	// java.util 패키지 import
public class Ex12_1 {
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");	// 에러 발생하지 않음
		for(int i = 0; i<arrayList.size(); i++) {
			System.out.println((String)arrayList.get(i));
		}
	}

}
