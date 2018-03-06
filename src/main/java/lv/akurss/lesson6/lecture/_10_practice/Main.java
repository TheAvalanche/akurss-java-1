package lv.akurss.lesson6.lecture._10_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person("John", "Doe"));
		list.add(new Person("Anne", "Loa"));
		list.add(new Person("George", "Smigh"));
		list.add(new Person("Zakk", "Black"));


		Collections.sort(list, new PersonComparator());
		
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getSurname().compareTo(o2.getSurname());
			}
		});
		
		for (Person p : list) {
			System.out.println(p.getName() + " " + p.getSurname());
		}
		
	}
	
	public static class PersonComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			// return > 0, if o1 > o2
			// return < 0, if o1 < o2
			// return 0, if  o1 == o2
			return o1.getName().compareTo(o2.getName());
		}
	}
	
}
