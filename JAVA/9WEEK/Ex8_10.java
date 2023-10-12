package org.javaro.lecture;

public class Ex8_10 {

	public static void main(String[] args) {
		Cat2 aCat = new Cat2();	// 객체 생성
		aCat.setName("야옹이");
		System.out.println(aCat.getName()+"의 장점="+aCat.crawling());

	}

}
class Animal2{
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String identify() {
		return "동물";
	}
}
class Cat2 extends Animal2{
	public String crawling() {	// 메소드 추가
		return "나무오르기";
	}
}
