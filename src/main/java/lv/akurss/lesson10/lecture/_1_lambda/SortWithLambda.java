package lv.akurss.lesson10.lecture._1_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithLambda {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Vasja"));
		list.add(new Person("Fjodor"));
		list.add(new Person("Kolja"));
		list.add(new Person("Anton"));

		Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		for (Person p : list) {
			System.out.println(p.getName());
		}
		
		
	}
	
	
}
