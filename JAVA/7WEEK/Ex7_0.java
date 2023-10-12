package org.javaro.lecture;
class NameX{
	String name;
	void setName(String nm) {	name = nm;	}	// this 생략
	String getName() { return name; }	// this 생략
	String getSName() { return "이름="+ getName(); } // this 생략
}

public class Ex7_0 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체");
		NameX kdhong = new NameX();
		kdhong.setName("홍길동");
		System.out.println(kdhong.getSName());

	}

}
