package org.javaro.lecture;
import java.util.*;	// java.util 패키지
public class Ex13_5 {
	public static void main(String[] args) {
		int Max = 10;
		DogX [] dogcage = new DogX[10];
		
		for (int i = 0; i<dogcage.length; i++) {
			dogcage[i] = new DogX();
		}
		for (int i = 0; i<dogcage.length; i++) {
			DogX dog= dogcage[i];
			dog.eat();
			dog.sleep();
			// dogcage[i].eat();
			// dogcage[i].sleep();
		}
	}
}
