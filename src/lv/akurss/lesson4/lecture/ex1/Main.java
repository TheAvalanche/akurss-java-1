package lv.akurss.lesson4.lecture.ex1;

public class Main {
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		System.out.println(superClass.field1);
		System.out.println(superClass.field2);
		
		SubClass subClass = new SubClass();
		System.out.println(subClass.field1);
		System.out.println(subClass.field2);
		System.out.println(subClass.field3);

		SuperClass subAsSuperClass = new SuperClass();
		System.out.println(subAsSuperClass.field1);
		System.out.println(subAsSuperClass.field2);		
		
	}
}
