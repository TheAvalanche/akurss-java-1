package lv.akurss.lesson5.lecture.instance_of_simple;

public class Main {

	public static void main(String[] args) {
		SuperClass sc = new SubClass1();
		System.out.println(sc instanceof SubClass1); //true
		System.out.println(sc instanceof SuperClass); //true
		System.out.println(sc instanceof SubClass2); //false
	}
	
}
