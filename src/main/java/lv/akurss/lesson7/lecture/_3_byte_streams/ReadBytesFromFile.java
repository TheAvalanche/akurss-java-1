package lv.akurss.lesson7.lecture._3_byte_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesFromFile {

	public static void main(String[] args) {
		File input = new File("src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_3_byte_streams\\test.txt");
	
		try (InputStream stream = new FileInputStream(input)) {
			
			int symbol;
			while ((symbol = stream.read()) != -1) {
				System.out.print((char) symbol);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
