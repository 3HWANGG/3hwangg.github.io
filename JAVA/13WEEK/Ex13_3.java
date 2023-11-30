package org.javaro.lecture;
public class Ex13_3 {
	public static void main(String[] args) {
		Dog[] dogcage = new Dog[2];
		Cat[] catcage = new Cat[3];
		Fox [] foxcage = new Fox[3];
		Wolf [] wolfcage = new Wolf[2];
		for (int i =0; i<dogcage.length; i++) dogcage[i] = new Dog();
		for (int i =0; i<catcage.length; i++) catcage[i] = new Cat();
		for (int i =0; i<foxcage.length; i++) foxcage[i] = new Fox();
		for (int i =0; i<wolfcage.length; i++) wolfcage[i] = new Wolf();
		for (int i =0; i<dogcage.length; i++) dogcage[i].eat(); 
		for (int i =0; i<catcage.length; i++) catcage[i].eat();
		for (int i =0; i<foxcage.length; i++) foxcage[i].eat();
		for (int i =0; i<wolfcage.length; i++) wolfcage[i].eat();
	}
}
class Fox extends Animal{
	@Override
	void eat() {
		System.out.println("fox eating");
	}
}
class Wolf extends Animal{
	@Override
	void eat() {
		System.out.println("wolf eating");
	}
}
