package lv.akurss.lesson5.lecture._3_exception_hierarchy;

public class CatchingAnyException {

	public static void main(String[] args) {
		try {
			doSmth();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	private static void doSmth() {
		//Can cause some exception
	}
	
}
