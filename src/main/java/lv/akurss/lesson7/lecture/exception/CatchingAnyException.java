package lv.akurss.lesson7.lecture.exception;

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
