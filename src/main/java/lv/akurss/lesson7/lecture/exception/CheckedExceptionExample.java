package lv.akurss.lesson7.lecture.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {

	}
	
	private void readFileWithTry() {
		File file = new File("test.txt");
		try {
			FileReader reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void readFileWithThrows() throws FileNotFoundException {
		File file = new File("test.txt");
		FileReader reader = new FileReader(file);
	}
	
}
