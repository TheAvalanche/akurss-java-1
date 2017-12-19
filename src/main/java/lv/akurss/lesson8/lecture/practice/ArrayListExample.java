package lv.akurss.lesson8.lecture.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		
		list.add(new Person("John", "Doe"));
		list.add(new Person("John", "Kramer"));
		list.add(new Person("Mary", "Smith"));
		list.add(new Person("Anna", "Lea"));
		
		//////
		
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p.getName() + " " + p.getSurname());
		}
		
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.getName() + " " + p.getSurname());
			
			if (p.getName().equals("John")) {
				iterator.remove();
			}
		}
		
		for (Person p : list) {
			System.out.println(p.getName() + " " + p.getSurname());
		}


		System.out.println("Size: " + list.size());
		
		Person p = list.get(0);
		System.out.println(p.getName() + " " + p.getSurname());
		
		list.remove(p);

		System.out.println("Size: " + list.size());
		
		
	}
	
}
