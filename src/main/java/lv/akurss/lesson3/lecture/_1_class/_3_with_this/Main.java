package lv.akurss.lesson3.lecture._1_class._3_with_this;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("John", "Doe");

		System.out.println("Hello, " + p1.name + " " + p1.surname);

		Person p2 = new Person("Marta", "Smith");

		System.out.println("Hello, " + p2.name + " " + p2.surname);
	}
	
}