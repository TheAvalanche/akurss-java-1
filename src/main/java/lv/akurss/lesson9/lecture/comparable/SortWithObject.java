package lv.akurss.lesson9.lecture.comparable;

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

		//Collections.sort(l1); ERROR - person should implement comparable

		List<ComparablePerson> l2 = new ArrayList<>();

		l2.add(new ComparablePerson("B", "B"));
		l2.add(new ComparablePerson("G", "G"));
		l2.add(new ComparablePerson("A", "A"));
		l2.add(new ComparablePerson("Z", "Z"));
		l2.add(new ComparablePerson("L", "L"));

		for (ComparablePerson p : l2) {
			System.out.println(p);
		}

		System.out.println("=============");

		Collections.sort(l2);

		for (ComparablePerson p : l2) {
			System.out.println(p);
		}
	}
	
}
