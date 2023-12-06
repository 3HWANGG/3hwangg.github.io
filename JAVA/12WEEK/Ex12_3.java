package org.javaro.lecture;
import java.util.*; // java util 패키지 import
public class Ex12_3 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(); // all String
		int idx = 0;
		String obj1 = "Korea";
		String obj2 = "Seoul";
		String obj3 = "Daejeon";
		arrayList.add(obj1); // 추가
		System.out.println("1="+arrayList.get(0)); // Korea
		arrayList.add(idx,obj2); // 추가
		for(int i=0; i<arrayList.size(); i++)
			System.out.println("2="+arrayList.get(i)); // Seoul Korea
		arrayList.set(idx,obj3); // 대체
		for(int i=0; i<arrayList.size(); i++)
			System.out.println("3="+arrayList.get(i)); // Daejeon Korea
		idx = arrayList.indexOf(obj1); // Korea 위치 = 1
		arrayList.remove(idx); // IDX = 1 --> Korea 제거 --> Daejeon 하나 남음
		int count = arrayList.size(); // 1
		System.out.println(count);
		Object[]str = arrayList.toArray();
		for(int i=0; i<str.length; i++)
			System.out.println((String)str[i]);
		arrayList.clear();
	}
}
