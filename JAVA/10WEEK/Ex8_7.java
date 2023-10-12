package org.javaro.lecture;
public class Ex8_7 {
	public static void main(String[] args) {
		Cat aCat = new Cat();	// 객체 생성
		aCat.setName("야옹이");
		System.out.println(aCat.getName()+"의 장점="+aCat.crawling());
		System.out.println(aCat.getName()+"는 "+aCat.identify());
		System.out.println(aCat.getName()+"는 원래"+aCat.identifyOrigin());
	}
}
class Animal{
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
class Cat extends Animal{
	@Override
	public String identify() {
		return "고양이";
	}
	public String crawling() {	
		return "나무오르기";
	}
	public String identifyOrigin() {
		String str = super.identify();
		return str;}
}
