package lv.akurss.lesson6.lecture._5_practice2;

import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("John", "Doe", 35);
		Person p2 = new Person("Jack", "Doe", 29);
		Person p3 = new Person("Joe", "Smith", 33);
		Person p4 = new Person("Jill", "Smith", 32);

		List<Person> l = new LinkedList<>();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		
		for (Person p : l) {
			System.out.println(p.getName());
		}

		System.out.println("Size: " + l.size());
		
		Person temp = l.get(0);
		System.out.println(temp.getName());
		
		l.remove(temp);

		System.out.println("Size: " + l.size());
		
		
	}
	
}
