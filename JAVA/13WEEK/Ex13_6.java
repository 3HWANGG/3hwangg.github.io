package org.javaro.lecture;
import java.util.*;	// java.util 패키지 import
public class Ex13_6 {
	public static void main(String[] args) {
		int Max = 10;
		ArrayList<DogX> dogcage = new ArrayList<DogX>();
		
		for (int i = 0; i<Max; i++) {
			dogcage.add(new DogX());
		}
		for (int i = 0; i<dogcage.size(); i++) {
			DogX dog= (DogX)dogcage.get(i);
			dog.eat();
			dog.sleep();
			// dogcage.get(i).eat();
			// dogcage.get(i).sleep();
		}

	}

}
