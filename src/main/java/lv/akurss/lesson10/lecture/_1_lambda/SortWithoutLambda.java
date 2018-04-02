package lv.akurss.lesson10.lecture._1_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLambda {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Vasja"));
		list.add(new Person("Fjodor"));
		list.add(new Person("Kolja"));
		list.add(new Person("Anton"));

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		for (Person p : list) {
			System.out.println(p.getName());
		}
		
		
	}
	
	
}
