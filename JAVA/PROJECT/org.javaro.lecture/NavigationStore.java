package org.javaro.lecture;
import java.util.ArrayList;

public class NavigationStore {
    private String storeName;
    private ArrayList<GPSNavigation> navigations;
    private ArrayList<Person> persons;

    public NavigationStore(String storeName) {
        this.storeName = storeName;
        navigations = new ArrayList<>();
        persons = new ArrayList<>();
    }

    public String getStoreName() {
        return this.storeName;
    }

    public ArrayList<GPSNavigation> getNavigations() {
        return this.navigations;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public void addNavigation(GPSNavigation navigation) {
        this.navigations.add(navigation);
    }

    public void removeNavigation(GPSNavigation navigation) {
        this.navigations.remove(navigation);
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void removePerson(Person person) {
        this.persons.remove(person);
    }

    public boolean purchase(GPSNavigation navigation, Person person) {
        int purchasedNavigations = this.getNavigationsForPerson(person).size();
        if (navigation.getPerson() == null) {
            if (purchasedNavigations < person.getMaxNavigations()) {
                navigation.setPerson(person);
                System.out.println(navigation.getNavigationID() + ", " + navigation.getProductName() + "를 " +
                        person.getPersonNumber() + ", " + person.getName() + "에게 대여함");
                return true;
            } else {
                System.out.println(navigation.getNavigationID() + ", " + navigation.getProductName() +
                        "대여 가능하나 " + person.getPersonNumber() + ", " + person.getName() + " 대여자 총량 초과");
                return false;
            }
        } else {
            System.out.println(navigation.getNavigationID() + ", " + navigation.getProductName() + " 이미 대여 중");
            return false;
        }
    }

    public boolean returnNavigation(GPSNavigation navigation) {
        if (navigation.getPerson() != null) {
            navigation.setPerson(null);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<GPSNavigation> getNavigationsForPerson(Person person) {
        ArrayList<GPSNavigation> result = new ArrayList<>();
        for (GPSNavigation aNavigation : this.getNavigations()) {
            if ((aNavigation.getPerson() != null) && (aNavigation.getPerson().getName().equals(person.getName()))) {
                result.add(aNavigation);
            }
        }
        return result;
    }

    public ArrayList<GPSNavigation> getAvailableNavigations() {
        ArrayList<GPSNavigation> result = new ArrayList<>();
        for (GPSNavigation aNavigation : this.getNavigations()) {
            if (aNavigation.getPerson() == null) {
                result.add(aNavigation);
            }
        }
        return result;
    }

    public ArrayList<GPSNavigation> getUnavailableNavigations() {
        ArrayList<GPSNavigation> result = new ArrayList<>();
        for (GPSNavigation aNavigation : this.getNavigations()) {
            if (aNavigation.getPerson() != null) {
                result.add(aNavigation);
            }
        }
        return result;
    }

    public String toString() {
        return this.getStoreName() + "의 보유 내비게이션=" + this.getNavigations().size() + " 대, 고객 수 " +
                this.getPersons().size() + " 명";
    }

    public void printStatus() {
        System.out.println(" --- 내비게이션 상점 현황 --- \n" + this.toString());
        for (GPSNavigation aNavigation : this.getNavigations()) {
            System.out.println(aNavigation);
        }
        for (Person person : this.getPersons()) {
            int count = this.getNavigationsForPerson(person).size();
            System.out.println(person + "은/는 " + count + " 대 대여 중");
        }
        System.out.println("현재 대여 가능 내비게이션: " + this.getAvailableNavigations().size());
        System.out.println("--- 리포트 종료 ---");
    }
}
