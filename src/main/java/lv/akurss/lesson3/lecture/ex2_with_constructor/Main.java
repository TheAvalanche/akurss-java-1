package lv.akurss.lesson3.lecture.ex2_with_constructor;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("John", "Doe");

		System.out.println("Hello, " + p1.name + " " + p1.surname);

		Person p2 = new Person("Marta", "Smith");

		System.out.println("Hello, " + p2.name + " " + p2.surname);
	}
}