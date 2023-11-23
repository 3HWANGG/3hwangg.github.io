package org.javaro.bookstore;
public class Student {
	private String name;
	private int maxBooks;		// max books the student can check out
	public Student() {	
		this.name =  "unknown name";
		this.maxBooks = 3;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int  getMaxBooks() {
		return maxBooks;
	}
	public void setMaxBook(int maxBook) {
		this.maxBooks = maxBooks;
	}
	public String toString() {
		return this.getName()+" ("+this.maxBooks +" 권)";
	}
}

