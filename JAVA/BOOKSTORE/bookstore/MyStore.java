package org.javaro.bookstore;
public class MyStore {
	public static void main(String[] args) {
		BookStore myStore = new BookStore("도서관리시 스템");
		Book book1 = new Book("전쟁과 평화");
		Book book2 = new Book("인류와 세계");
		book1.setAuthor("톨스토이");
		book2.setAuthor("디킨스");
		Student stud1 = new Student();
		Student stud2 = new Student();
		stud1.setName("홍길동");
		stud2.setName("성춘향");
		myStore.addBook(book1);
		myStore.addBook(book2);
		myStore.addStudent(stud1);
		myStore.addStudent(stud2);
		System.out.println("도서관리 시스템 생성");
		myStore.printStatus();
		myStore.checkOut(book1, stud2);
		myStore.printStatus();
		myStore.checkIn(book1);
		myStore.checkOut(book2, stud1);
		myStore.printStatus();
	}
}
