package lv.akurss.lesson4.lecture.method_override;

public class SuperClass {
	int field1;
	String field2;

	public SuperClass(int field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	
	public void doSmth1() {
		System.out.println("Doing smth1 in superclass");
	}
	
	public void doSmth2() {
		System.out.println("Doing smth2 in superclass");
	}

	public void doSmth3() {
		System.out.println("Doing smth3 in superclass");
	}
	
}
