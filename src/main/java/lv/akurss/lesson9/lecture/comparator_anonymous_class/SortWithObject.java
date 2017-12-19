package lv.akurss.lesson9.lecture.comparator_anonymous_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		Collections.sort(l1, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		for (Person p : l1) {
			System.out.println(p);
		}
	}
}
