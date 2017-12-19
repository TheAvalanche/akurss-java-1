package lv.akurss.lesson3.lecture.ex4_with_method;

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
