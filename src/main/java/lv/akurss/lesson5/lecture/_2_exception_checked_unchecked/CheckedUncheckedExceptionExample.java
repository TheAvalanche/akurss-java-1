package lv.akurss.lesson5.lecture._2_exception_checked_unchecked;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class CheckedUncheckedExceptionExample {


	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			String fileContent = readFile();

			System.out.println(fileContent);

			String fileContent2 = readFile();

			System.out.println(fileContent2);

			String fileContent3 = readFile();

			System.out.println(fileContent3);

			String fileContent4 = readFile();

			System.out.println(fileContent4);
		} catch (IOException e) {
			e.printStackTrace();
		} 

		
		
	}
	
	public static String readFile() throws IOException {
		return Files.lines(Paths.get("test.txt")).collect(Collectors.joining("\n"));
	}
	
	
}
