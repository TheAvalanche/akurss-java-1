package lv.akurss.lesson3.lecture.ex1_simple;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "John";
		p1.surname = "Doe";

		System.out.println("Hello, " + p1.name + " " + p1.surname);

		Person p2 = new Person();
		p2.name = "Marta";
		p2.surname = "Smith";

		System.out.println("Hello, " + p2.name + " " + p2.surname);
	}
}
