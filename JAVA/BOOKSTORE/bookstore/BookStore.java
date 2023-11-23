package org.javaro.bookstore;
import java.util.ArrayList;
public class BookStore {
		public String name;
		public ArrayList<Book> books;
		public ArrayList<Student> students;
		public BookStore(String name) {
			this.name = name;
			books = new ArrayList<Book>();
			students = new ArrayList<Student>();
		}
		public String getName() {
			return name;
		}
		public ArrayList<Book> getBooks(){
			return this.books;
		}
		public ArrayList<Student> getStudents(){
			return this.students;
		}
		public void addBook(Book b1) {
			this.books.add(b1);
		}
		public void removeBook(Book b1) {
			this.books.remove(b1);
		}
		public void addStudent(Student student) {
			this.students.add(student);
		}
		public void removeBook(Student student) {
			this.students.remove(student);
		}
		
		public boolean checkOut(Book b1, Student p1) {
			//	b1.setPerson(p1);	// book1에 p1객체를 입력
			int booksOut = this.getBooksForStudent(p1).size();	// p1의 도서 대출 총량 계산
			if((b1.getStudent() == null)		// b1객체의 getStudent()실행결과가 null이면 (즉 Person이 할당되어있지 않으면)
			&& (booksOut < p1.getMaxBooks()))	//	p1의 총대출총량 < 도서대출제한수
			{	// 도서 b1이 대여 되지 않았으면	
				b1.setStudent(p1);	// 도서 b1을 학생 p1에게 대여
				return true;
			}
			else {
				return false;
			}
		}
		public boolean checkIn(Book b1) {
			if(b1.getStudent() != null) 	// b1객체의 getStudent()실행결과가 null이 아니면 (즉 Person이 할당되어있으면)
			{	// 도서 book이 대여된 책이면
				b1.setStudent(null);		// 도서 b1을 대여가능(null) 책으로 설정 
				return true;
			}
			else {
				return false;
			}
		}
		
		public ArrayList<Book> getBooksForStudent(Student p1){
			ArrayList<Book> result = new ArrayList<Book>();
			for (Book aBook : this.getBooks()) {
				if((aBook.getStudent() != null) && (aBook.getStudent().getName().equals(p1.getName()))) {
					result.add(aBook);
				}
			}
			return result;
		}
		public ArrayList<Book> getAvailableBooks(){
			ArrayList<Book> result = new ArrayList<Book>();
			for (Book aBook : this.getBooks()) {
				if(aBook.getStudent() == null) {
					result.add(aBook);
				}
			}
			return result;
		}
		public ArrayList<Book> getUnavailableBooks(){
			ArrayList<Book> result = new ArrayList<Book>();
			for (Book aBook : this.getBooks()) {
				if(aBook.getStudent() != null) {
					result.add(aBook);
				}
			}
			return result;
		}
		public String toString() {
			return this.getName() + ": "+this.getBooks().size()+" 권; "+this.getStudents().size()+" 명.";
			}
		public void printStatus() {
			System.out.println("도서관리 리포트\n"+ this.toString());
			for (Book aBook : this.getBooks()) {
				System.out.println(aBook);
				//System.out.println(aBook.toString());
			}
			for (Student p : this.getStudents()) {
				int count = this.getBooksForStudent(p).size();
				System.out.println(p + "은/는" +count +"권 대출");
			}
			System.out.println("대출 가능 책: "+this.getAvailableBooks().size());
			System.out.println("--- 리포트 종료 ---");
		}
	}
