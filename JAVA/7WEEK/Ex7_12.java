package org.javaro.lecture;

public class Ex7_12 {

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체");
		Animal anim = new Animal();	// 객체생성
		anim.setName("야옹이");
		System.out.println(anim.getName()+"는 "+anim.identify());
	}

}
class Animal{	// 클래스 선언
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String identify() {	// 신분
		return "동물";
	}
		
}
