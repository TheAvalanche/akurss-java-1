package lv.akurss.lesson7.lecture._4_symbol_streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadCharsFromFile {

	public static void main(String[] args) {
		File input = new File("src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_4_symbol_streams\\test.txt");
		
		try (Reader reader = new FileReader(input)) {
			int symbol;
			while ((symbol = reader.read()) != -1) {
				System.out.print((char) symbol);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
