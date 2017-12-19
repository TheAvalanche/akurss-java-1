package lv.akurss.lesson9.lecture.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithString {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		
		l1.add("B");
		l1.add("G");
		l1.add("A");
		l1.add("Z");
		l1.add("L");

		for (String s : l1) {
			System.out.println(s);
		}

		System.out.println("=============");

		Collections.sort(l1);

		for (String s : l1) {
			System.out.println(s);
		}
	}
	
}
