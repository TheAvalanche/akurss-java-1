package lv.akurss.lesson3.lecture._1_class._6_getters_setters;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("John", "Doe");
		System.out.println(p1.getName());
		
		p1.setName("Alex");
		System.out.println(p1.getName());
	}
	
}
