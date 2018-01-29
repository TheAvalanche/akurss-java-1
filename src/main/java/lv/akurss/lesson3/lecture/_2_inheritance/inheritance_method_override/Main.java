package lv.akurss.lesson3.lecture._2_inheritance.inheritance_method_override;

public class Main {
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass(0, "");
		superClass.doSmth1();
		System.out.println("------");
		superClass.doSmth2();
		System.out.println("------");
		superClass.doSmth3();

		System.out.println("=======================");
		
		SubClass subClass = new SubClass(0, "", 0);
		subClass.doSmth1();
		System.out.println("------");
		subClass.doSmth2();
		System.out.println("------");
		subClass.doSmth3();
	}
}
