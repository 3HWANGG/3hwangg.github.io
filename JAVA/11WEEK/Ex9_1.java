// 인터페이스 구현
package org.javaro.lecture;

public class Ex9_1 {

	public static void main(String[] args) {
		KHello khello1 = new KHello();
		khello1.goodMorning();
		khello1.goodNight();
	}
}
interface GoodMorning{
	abstract void goodMorning();
}
interface GoodNight{
	abstract void goodNight();
}
class KHello implements GoodMorning, GoodNight{
	public void goodMorning() {
		System.out.println("좋은 아침");
	}
	public void goodNight() {
		System.out.println("좋은 저녁");
	}
}
