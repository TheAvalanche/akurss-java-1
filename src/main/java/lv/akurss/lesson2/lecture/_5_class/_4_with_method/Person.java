package lv.akurss.lesson2.lecture._5_class._4_with_method;

public class Person {
	String name;
	String surname;
	
	Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	void greet() {
		System.out.println("Hello, my name is " + name + " " + surname);
	}
}
