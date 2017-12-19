package lv.akurss.lesson8.lecture.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Test0", "Test0"));
		list.add(new Person("Test1", "Test1"));
		list.add(new Person("Test2", "Test2"));
		list.add(new Person("Test3", "Test3"));
		list.add(new Person("Test4", "Test4"));
		
		for (Person p : list) {
			System.out.println(p.getName() + " " + p.getSurname());
		}

		for (Iterator<Person> iterator = list.iterator(); iterator.hasNext(); ) {
			Person p = iterator.next();
			System.out.println(p.getName() + " " + p.getSurname());
		}

		System.out.println("Size: " + list.size());
		
		Person p = list.get(0);
		System.out.println(p.getName() + " " + p.getSurname());
		
		list.remove(p);

		System.out.println("Size: " + list.size());
	}
	
}
