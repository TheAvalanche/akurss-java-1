package lv.akurss.lesson6.lecture.practice;

public class Main {

	public static void main(String[] args) {
		Person person = new PersonWithOverrides("John", "Snow");
		Person person1 = new Person("Arya", "Stark");
		Person person2 = new Person("John", "Snow");

		System.out.println(person instanceof Person);
		System.out.println(person instanceof Object);

		System.out.println(person.toString());
		System.out.println(person);
		System.out.println(person1.toString());
		System.out.println(person.hashCode());
		System.out.println(person1.hashCode());

		System.out.println(person.getClass());

		System.out.println(person.equals(person1));
		System.out.println(person.equals(person2));
	}
	
}
