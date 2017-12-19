package lv.akurss.lesson7.lecture.exception;

public class CustomCheckedException extends Exception {

	public CustomCheckedException(String message) {
		super(message);
	}

	public static void main(String[] args) throws CustomCheckedException {
		throw new CustomCheckedException("Test");
	}
}
