package lv.akurss.lesson5.lecture._1_exception_catch;

public class NullPointerExceptionCatchExample {

	public static void main(String[] args) {
		String a = null;

		try {
			System.out.println(a.equals(""));
		} catch (NullPointerException npe) {
			System.out.println("a is not defined. Try later...");
		}
		
		System.out.println("Finish");
	}
	
}
