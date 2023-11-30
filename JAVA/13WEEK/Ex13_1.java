package org.javaro.lecture;
public class Ex13_1 {
	public static void main(String[] args) {
		System.out.println("animalfarm");
		Animal exAnim = new Animal();
		System.out.println(exAnim.age);
		exAnim.eat();
		exAnim.sleep();
		Dog exDog = new Dog();
		exDog.eat();
		exDog.sleep();
		exDog.bark();
	}
}
class Animal{
	int age;
	public Animal() {
		age = 0;
	}
	void eat() {
		System.out.println("animal eating");
	}
	void sleep() {
		System.out.println("animal sleeping");
	}
}
class Dog extends Animal{
	public Dog() {
			super();
	}
	void bark() {
		System.out.println("멍멍");
	}
	@Override
	void eat() {
		//super.eat();
		System.out.println("dog eating");
	}
}
class  Cat extends Animal{
	Cat(){
		super();
	}
	void bark() {
		System.out.println("야옹");
	}
	@Override
	void eat() {
		//super.eat()
		System.out.println("cat eating");
	}
}
