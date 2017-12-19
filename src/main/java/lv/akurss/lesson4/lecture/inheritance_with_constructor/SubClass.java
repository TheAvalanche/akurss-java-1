package lv.akurss.lesson4.lecture.inheritance_with_constructor;

public class SubClass extends SuperClass {
	int field3;

	public SubClass(int field1, String field2) {
		super(field1, field2);
	}

	public SubClass(int field1, String field2, int field3) {
		super(field1, field2);
		this.field3 = field3;
	}
}
