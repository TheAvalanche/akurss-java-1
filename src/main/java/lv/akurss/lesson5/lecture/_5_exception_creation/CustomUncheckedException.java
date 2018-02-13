package lv.akurss.lesson5.lecture._5_exception_creation;

public class CustomUncheckedException extends RuntimeException {

	public CustomUncheckedException(String message) {
		super(message);
	}

	public static void main(String[] args) {
		throw new CustomUncheckedException("Test");
	}
}
