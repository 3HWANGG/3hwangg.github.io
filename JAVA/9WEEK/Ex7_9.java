// 객체) Ex7_9 객체 예제(Midter/Student/Exam)
package org.javaro.lecture;

public class Ex7_9 {	// Midterm

	public static void main(String[] args) {
		System.out.println("황은진"+"-"+"20221137"+"-"+"객체"); 
		Student stud1 =new Student("201901", "홍길동",3); // 생성자 이용 초기화 
	//	stud1.exam[0].setExamScore("자바",88);
	//  stud1.exam[1].setExamScore("C",91);
	//  stud1.exam[2].setExamScore("C++",92);
				
	    stud1.exam[0].setSubject("자바");
	    stud1.exam[1].setSubject("C");
	    stud1.exam[2].setSubject("C++");
	    stud1.exam[0].setScore(88);
	    stud1.exam[1].setScore(91); 
	    stud1.exam[2].setScore(92);
	    stud1.printGPA();
	}
}
class Student{	// 클래스 선언
	String studNo, name; 
	int totSubject;
	Exam [] exam;	// 객체배열 선언
	public Student(String studNo, String name, int totSubject) {
		this.studNo = studNo;
		this.name = name;	
		this.totSubject=totSubject;
		exam = new Exam[totSubject];	// 객체배열 선언
		for(int i =0; i<exam.length;i++) { 
			exam[i] = new Exam(); // 초기화
		}
	}
	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getGPA() {
		int sum = 0;
		for(int i =0; i<exam.length; i++) sum = sum + this.exam[i].getScore();
		return sum;
	}
	public void printGPA() {
		for(int i = 0; i<exam.length; i++) {
			System.out.println("과목명:"+this.exam[i].getSubject()+",점수="+this.exam[i].getScore());
		}
		System.out.println("과목합계="+this.getGPA());
	}
}
class Exam{
	String subject;
	int score;
	public void setExamScore(String subject, int score) {
		this.subject = subject;
		this.score = score;
	} // 생략가능
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
}
