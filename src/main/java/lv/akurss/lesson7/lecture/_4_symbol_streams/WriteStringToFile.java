package lv.akurss.lesson7.lecture._4_symbol_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteStringToFile {

	public static void main(String[] args) {
		File output = new File("src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_4_symbol_streams\\test.txt");
		
		try (Writer writer = new FileWriter(output)) {
			writer.write("Hello, world!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
