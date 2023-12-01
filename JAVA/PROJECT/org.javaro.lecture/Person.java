package org.javaro.lecture;
public class Person {
    private String name;
    private String personNumber;
    private int maxNavigations; // 대출 가능한 최대 네비게이션 수

    public Person() {
    }

    public Person(String personNumber) {
        this.personNumber = personNumber;
        this.name = "unknown name";
        this.maxNavigations = 3;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonNumber() {
        return this.personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public int getMaxNavigations() {
        return maxNavigations;
    }

    public void setMaxNavigations(int maxNavigations) {
        this.maxNavigations = maxNavigations;
    }

    public String toString() {
        return "ID=" + this.getPersonNumber() + ", 이름=" + this.getName() + " (" + this.maxNavigations + " 대)";
    }
}
