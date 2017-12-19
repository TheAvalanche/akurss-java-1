package lv.akurss.lesson8.lecture.sets;

import lv.akurss.lesson8.lecture.lists.Person;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("Test0", "Test0"));
		set.add(new Person("Test1", "Test1"));
		set.add(new Person("Test2", "Test2"));
		set.add(new Person("Test3", "Test3"));
		set.add(new Person("Test4", "Test4"));

		for (Person p : set) {
			System.out.println(p.getName() + " " + p.getSurname());
		}

		System.out.println("Size: " + set.size());
	}
	
}
