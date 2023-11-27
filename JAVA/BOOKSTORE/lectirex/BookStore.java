package org.javaro.lecturex;
import java.util.ArrayList;
import org.javaro.lecturex.Book;
import org.javaro.lecturex.Student;
public class BookStore {
		public String storeName;
		public ArrayList<Book>books;
		public ArrayList<Student> students;
		public BookStore(String storeName) {
			this.storeName = storeName;
			books = new ArrayList<Book>();
			students = new ArrayList<Student>();
		}
		public String getStoreName() {
			return this.storeName;
		}
		public ArrayList<Book> getBooks(){
			return this.books;
		}
		public ArrayList<Student> getStudents(){
			return this.students;
		}
		public void addBook(Book book) {
			this.books.add(book);
		}
		public void removeBook(Book book) {
			this.books.remove(book);
		}
		public void addStudent(Student student) {
			this.students.add(student);
		}
		public void removeBook(Student student) {
			this.students.remove(student);
		}
		
		public boolean checkOut(Book book, Student student) {
			int booksOut = this.getBooksForStudent(student).size();	// student의 도서 대출 총량 계산
			if(book.getStudent() == null)	{	// 대출 가능
				if (booksOut < student.getMaxBooks()){	//	총량 이하
					book.setStudent(student);	// 도서 book을 학생 student에게 대여
					System.out.println(book.getIsbn()+","+book.getTitle()+"를"+student.getStudNumber()+","+student.getName()+"에게 대출함");
					return true;
				}else {
					System.out.println(book.getIsbn()+","+book.getTitle()+"대출 가능하나"+student.getStudNumber()+","+student.getName()+"대출자 총량 초과");
					return false;
				}
			}
			else {
				System.out.println(book.getIsbn()+","+book.getTitle()+"이미 대출중");
				return false;
			}
		}
		public boolean checkIn(Book book) {
			if(book.getStudent() != null) 	// book객체의 getStudent()실행결과가 null이 아니면 (즉 student이 할당되어있으면)
			{	// 도서 book이 대여된 책이면
				book.setStudent(null);		// 도서 book을 대여가능(null) 책으로 설정 
				return true;
			}
			else {
				return false;
			}
		}
		
		public ArrayList<Book> getBooksForStudent(Student student){
			ArrayList<Book> result = new ArrayList<Book>();
			for (Book aBook : this.getBooks()) {
				if((aBook.getStudent() != null) && (aBook.getStudent().getName().equals(student.getName()))) {
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
			return this.getStoreName() + "의 보유책="+this.getBooks().size()+" 권,  회원수 "+this.getStudents().size()+" 명";
			}
		public void printStatus() {
			System.out.println(" --- 도서관 현황 --- \n"+ this.toString());
			for (Book aBook : this.getBooks()) {
				System.out.println(aBook);
				// System.out.println(aBook.toString());
			}
			for (Student student : this.getStudents()) {
				int count = this.getBooksForStudent(student).size();
				System.out.println(student + "은/는" +count +"권 대출중");
			}
			System.out.println("현재 대출 가능 책: "+this.getAvailableBooks().size());
			System.out.println("--- 리포트 종료 ---");
		}
	}
