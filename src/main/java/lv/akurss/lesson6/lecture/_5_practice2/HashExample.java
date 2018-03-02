package lv.akurss.lesson6.lecture._5_practice2;

public class HashExample {

	public static void main(String[] args) {
		String a = "a";

		System.out.println(a.hashCode());
		
		String b = "b";

		System.out.println(b.hashCode());
		
		Person p = new Person("John", "Doe", 35);
		Person p2 = new Person("John", "Dow", 35);
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());

		System.out.println("Aa".hashCode());
		System.out.println("BB".hashCode());
	}
	
}
