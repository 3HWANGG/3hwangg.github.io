package org.javaro.lecture;
public class Ex13_4 {
	public static void main(String[] args) {
		AnimalX [] cage = new AnimalX[10];
		for (int i = 0; i<cage.length; i++) {
			if(i<2) cage[i] = new DogX();
			else if (i<5) cage[i] = new CatX();
			else if (i<8) cage[i] = new WolfX();
			else cage[i] = new FoxX();
		}
		for (int i =0; i<cage.length; i++) cage[i].eat();
	}
}
class AnimalX{
	int age;
	public AnimalX() { age = 0; }
	void eat() { System.out.println("animal eating"); }
	void sleep() { System.out.println("animal sleeping"); }
}
class DogX extends AnimalX{
	public DogX() { super(); }
	void eat() { System.out.println("dog eating"); }
}
class  CatX extends AnimalX{
	public CatX(){ super(); }
	void eat()  { System.out.println("cat eating"); }
}
class  FoxX extends AnimalX{
	public FoxX(){ super(); }
	void eat() {
		//super.eat()
		System.out.println("fox eating");
	}
}
class  WolfX extends AnimalX{
	public WolfX(){
		super();
	}
	void eat() {
		//super.eat()
		System.out.println("wolf eating");
	}
}
