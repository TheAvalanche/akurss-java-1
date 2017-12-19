package lv.akurss.lesson4.lecture.method_override;

public class SubClass extends SuperClass {
	int field3;

	public SubClass(int field1, String field2) {
		super(field1, field2);
	}

	public SubClass(int field1, String field2, int field3) {
		super(field1, field2);
		this.field3 = field3;
	}

	@Override
	public void doSmth2() {
		System.out.println("Doing smth2 in subclass");
	}

	@Override
	public void doSmth3() {
		super.doSmth3();
		System.out.println("Doing smth3 in subclass");
	}
}
