package lv.akurss.lesson4.lecture.inheritance_with_constructor;

public class Main {
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass(0, "");
		System.out.println(superClass.field1);
		System.out.println(superClass.field2);
		
		SubClass subClass = new SubClass(0, "", 0);
		System.out.println(subClass.field1);
		System.out.println(subClass.field2);
		System.out.println(subClass.field3);

		SuperClass subAsSuperClass = new SubClass(0, "", 0);
		System.out.println(subAsSuperClass.field1);
		System.out.println(subAsSuperClass.field2);		
		
	}
}
