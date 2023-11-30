package org.javaro.menu;
import  java.util.ArrayList;
import  java.util.Arrays;
import  java.util.Scanner;
import org.javaro.lecturex.*;

public class MyMenu {
	public static void main(String[] args) {
		BookStore testLibrary = new BookStore("도서관리 시스템");
		int menu;
		boolean check = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("---메뉴---");
			System.out.println("1. 책등록");
			System.out.println("2. 회원등록");
			System.out.println("3. 대출");
			System.out.println("4. 반납");
			System.out.println("5. 보고서");
			System.out.println("6. 종료");
			System.out.println("메뉴 선택>>");
			menu = scan.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("책 등록");
					System.out.println("도서 번호(isbn) 입력!");
					String isbn = scan.next();
					System.out.println("도서 이름 입력!");
					String title = scan.next();
					System.out.println("저자 이름 입력!");
					String author = scan.next();
					Book book = new Book();
					book.setIsbn(isbn);
					book.setTitle(title);
					book.setAuthor(author);
					testLibrary.addBook(book);
					break;
				case 2:
					System.out.println("회원 등록");
					System.out.println("회원 번호 입력!");
					String studNumber = scan.next();
					System.out.println("회원 이름 입력!");
					String name = scan.next();
					System.out.println("최대 대출 권수 입력!");
					String maxBooks = scan.next();	// maxBooks는 원래 정수형 변수로 선언됨, scan은 문자열
					Student stud = new Student();
					stud.setStudNumber(studNumber);
					stud.setName(name);
					stud.setMaxBooks(Integer.parseInt(maxBooks));	// 문자열을 정수로 형변환
					testLibrary.addStudent(stud);
					break;
				case 3:
					System.out.println("대출");
					System.out.println("도서 번호(sibn) 이름 입력!");
					isbn  = scan.next();
					Book findBook = null;
					for (Book b: testLibrary.getBooks()) {
						if(b.getIsbn().equals(isbn)) {
							findBook = b;
							break;
						}
					}
					System.out.println("대출 회원 번호 입력!");
					studNumber = scan.next();
					Student findStudent = null;
					for (Student s: testLibrary.getStudents()) {
						if(s.getStudNumber().equals(studNumber)) {
							findStudent = s;
							break;
						}
					}
				testLibrary.checkOut(findBook,findStudent);
				break;
				case 4:
					System.out.println("반납");
					System.out.println("반납 도서 번호 입력!");
					isbn = scan.next();
					findBook = null;
					for (Book b: testLibrary.getBooks()) {
						if(b.getIsbn().equals(isbn)) {
							findBook = b;	
							break;
						}
					}
					testLibrary.checkIn(findBook);		break;
				case 5:
					System.out.println("보고서 인쇄");
					testLibrary.printStatus();	break;
				case 6:
					System.out.println("종료합니다");
					check = false;	break;
				default:
					System.out.println("잘못된 입력함, 새로 입력하세요");
			}
		}while(check);
		scan.close();

	}
}
