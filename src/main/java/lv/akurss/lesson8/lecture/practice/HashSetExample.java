package lv.akurss.lesson8.lecture.practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("John", "Doe"));
		set.add(new Person("John", "Kramer"));
		
		for (Person p : set) {
			System.out.println(p.getName() + " " + p.getSurname());
		}
	}
	
}
