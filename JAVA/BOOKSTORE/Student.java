package org.javaro.lecture;
public class Student {
	private String name;
	public Student() {	}
	public String getName() {
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString() {
		return "학생이름="+this.getName();
	}
}
