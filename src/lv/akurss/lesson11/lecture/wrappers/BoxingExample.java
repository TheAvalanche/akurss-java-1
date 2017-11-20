package lv.akurss.lesson11.lecture.wrappers;

public class BoxingExample {

	public static void main(String[] args) {
		doSmthWithPrimitive(25);
		doSmthWithPrimitive(new Integer(25));
		
		doSmthWithObject(new Integer(25));
		doSmthWithObject(25);
	}
	
	private static void doSmthWithPrimitive(int a) {
		//do smth
	}

	private static void doSmthWithObject(Integer a) {
		//do smth
	}
	
}
