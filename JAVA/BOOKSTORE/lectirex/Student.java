package org.javaro.lecturex;
public class Student {
	private String name;
	private String studNumber;
	private int maxBooks;		// 대출 가능한 최대 도서 수
	public Student() {	
	}
	public Student(String studNumber) {
		this.studNumber = studNumber;
		this.name =  "unknown name";
		this.maxBooks = 3;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getStudNumber() {
		return this.studNumber;
	}
	public void setStudNumber(String studNumber) {
		this.studNumber = studNumber;
	}
	public int  getMaxBooks() {
		return maxBooks;
	}
	public void setMaxBook(int maxBooks) {
		this.maxBooks = maxBooks;
	}
	public String toString() {
		return "학번="+this.getStudNumber()+", 학생이름="+this.getName()+" ("+this.maxBooks +" 권)";
	}
}


