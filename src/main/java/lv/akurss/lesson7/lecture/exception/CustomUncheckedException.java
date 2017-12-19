package lv.akurss.lesson7.lecture.exception;

public class CustomUncheckedException extends RuntimeException {

	public CustomUncheckedException(String message) {
		super(message);
	}

	public static void main(String[] args) {
		throw new CustomUncheckedException("Test");
	}
}
