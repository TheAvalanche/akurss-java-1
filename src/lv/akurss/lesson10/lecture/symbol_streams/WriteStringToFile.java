package lv.akurss.lesson10.lecture.symbol_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteStringToFile {

	public static void main(String[] args) {

		File output = new File("src/lv/akurss/lesson10/lecture/symbol_streams/test.txt");
		
		try (Writer fileWriter = new FileWriter(output)) {
			fileWriter.write("Hello, world!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
