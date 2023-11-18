// 인터페이스 상속구현
package org.javaro.lecture;

public class Ex9_3 {

	public static void main(String[] args) {
		KHello4 khello1 = new KHello4();
		khello1.goodMorning3();
		khello1.goodNight3();
		khello1.goodAfternoon3();
	}
}
interface GoodMorning3{
	abstract void goodMorning3();
}
interface GoodNight3{
	abstract void goodNight3();
}

class KHello3 implements GoodMorning3, GoodNight3{
	public void goodMorning3() {
		System.out.println("좋은 아침");
	}
	public void goodNight3() {
		System.out.println("좋은 저녁");
	}
}
interface KSay extends GoodMorning3, GoodNight3{
	abstract void goodAfternoon3();
}
class KHello4 extends KHello3 implements KSay{
	public void goodAfternoon3() {
		System.out.println("좋은 점심");
	}
}
