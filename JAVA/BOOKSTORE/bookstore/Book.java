package org.javaro.bookstore;
public class Book {
	public String title;
	public String author;
	private Student student;
	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}
	public  String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setStudent(Student student)
	{
		this.student = student;
	}
	public Student getStudent()
	{
		return this.student;
	}
	public String toString()
	{
		String available;		// 변수 available 설정
		if(this.getStudent() == null) {		// book 객체의 student 객체가 null 이면
			available = "대출가능";		// 대출 가능
		}
		else {	// null 이 아니면, 대출되었으면
			available = "대출됨"+this.getStudent().getName();		// available에 대출학생 이름 설정
		}
		return this.getTitle()+" 저자 "+this.getAuthor()+";"+available;	// 전체문구반환
	}
}

