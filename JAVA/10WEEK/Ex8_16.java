package org.javaro.lecture;

public class Ex8_16 {

	public static void main(String[] args) {
		WebCount2 c1 =new WebCount2();
		WebCount2 c2 =new WebCount2();

	}

}
class WebCount2{
	static int count = 0;
	WebCount2(){
		this.count++;
		System.out.println(this.count);
	}
}
