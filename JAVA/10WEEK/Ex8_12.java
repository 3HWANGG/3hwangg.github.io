package org.javaro.lecture;
public class Ex8_12 {
	public static void main(String[] args) {
		Pine pine = new Pine("3.5", "소나무");
		System.out.println("높이(m) : "+pine.getHeight());
		System.out.println("품종 :"+pine.getSpecies());
	}
}
class Tree {		//  클래스 선언
	String height;
	public Tree(String height) {    // 생성자
		this.height = height;
	}
	public void setHeight(String height) {
		this.height= height;
	}
	public String getHeight() {
		return this.height;
	}
}
class Pine extends Tree{
	String species;	// 품종 변수 추가
	public Pine(String height, String species) {	// 생성자
		super(height);
		this.species = species;
	}
	public void seetSpecies(String species) {    // 메소드 추가
		this.species = species;
	}
	public String getSpecies() {    // 메소드 추가
		return this.species;
	}
}
