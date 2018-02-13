package lv.akurss.lesson5.lecture._5_exception_creation;

public class CustomCheckedException extends Exception {

	public CustomCheckedException(String message) {
		super(message);
	}

	public static void main(String[] args) throws CustomCheckedException {
		throw new CustomCheckedException("Test");
	}
}
