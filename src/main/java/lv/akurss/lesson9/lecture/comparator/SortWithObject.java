package lv.akurss.lesson9.lecture.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithObject {

	public static void main(String[] args) {
		List<Person> l1 = new ArrayList<>();
		
		l1.add(new Person("B", "B"));
		l1.add(new Person("G", "G"));
		l1.add(new Person("A", "A"));
		l1.add(new Person("Z", "Z"));
		l1.add(new Person("L", "L"));

		for (Person p : l1) {
			System.out.println(p);
		}

		System.out.println("=============");

		Collections.sort(l1, new PersonComparator());

		for (Person p : l1) {
			System.out.println(p);
		}
	}
	
}
