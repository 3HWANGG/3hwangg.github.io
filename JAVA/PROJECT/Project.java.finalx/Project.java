package Project.java.finalx;
import  java.util.Scanner;
import org.javaro.lecture.*;
public class Project {
	public static void main(String[] args) {
		System.out.println("20221137 황은진 프로젝트");
		NavigationStore testNavigationStore = new NavigationStore("내비게이션 상점 대여 시스템");
        int menu;
        boolean check = true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("---메뉴---");
            System.out.println("1. 제품 등록");
            System.out.println("2. 고객 등록");
            System.out.println("3. 대여");
            System.out.println("4. 반납");
            System.out.println("5. 보고서");
            System.out.println("6. 종료");
            System.out.print("메뉴 선택>> ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("제품 등록");
                    System.out.println("제품 번호(ID) 입력:");
                    String navigationID = scan.next();
                    System.out.println("제품 이름 입력:");
                    String productName = scan.next();
                    System.out.println("제조사 입력:");
                    String manufacturer = scan.next();

                    GPSNavigation navigation = new GPSNavigation();
                    navigation.setNavigationID(navigationID);
                    navigation.setProductName(productName);
                    navigation.setManufacturer(manufacturer);

                    testNavigationStore.addNavigation(navigation);
                    break;
                case 2:
                    System.out.println("고객 등록");
                    System.out.println("고객 번호 입력:");
                    String personNumber = scan.next();
                    System.out.println("고객 이름 입력:");
                    String name = scan.next();
                    System.out.println("최대 구매 수량 입력:");
                    int maxPurchases = scan.nextInt();

                    Person person = new Person();
                    person.setPersonNumber(personNumber);
                    person.setName(name);
                    person.setMaxNavigations(maxPurchases);
                    testNavigationStore.addPerson(person);
                    break;
                case 3:
                    System.out.println("구매");
                    System.out.println("제품 번호(ID) 입력:");
                    navigationID = scan.next();
                    GPSNavigation findNavigation = null;

                    for (GPSNavigation n : testNavigationStore.getNavigations()) {
                        if (n.getNavigationID().equals(navigationID)) {
                            findNavigation = n;
                            break;
                        }
                    }

                    System.out.println("고객 번호 입력:");
                    personNumber = scan.next();
                    Person findperson = null;

                    for (Person p : testNavigationStore.getPersons()) {
                        if (p.getPersonNumber().equals(personNumber)) {
                            findperson = p;
                            break;
                        }
                    }

                    testNavigationStore.purchase(findNavigation, findperson);
                    break;
                case 4:
                    System.out.println("반납");
                    System.out.println("반납 제품 번호 입력:");
                    navigationID = scan.next();
                    findNavigation = null;

                    for (GPSNavigation n : testNavigationStore.getNavigations()) {
                        if (n.getNavigationID().equals(navigationID)) {
                            findNavigation = n;
                            break;
                        }
                    }

                    testNavigationStore.returnNavigation(findNavigation);
                    break;
                case 5:
                    System.out.println("보고서 인쇄");
                    testNavigationStore.printStatus();
                    break;
                case 6:
                    System.out.println("종료합니다");
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        } while (check);

        scan.close();
    }
}

