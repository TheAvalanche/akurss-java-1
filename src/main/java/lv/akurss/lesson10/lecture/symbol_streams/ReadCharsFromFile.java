package lv.akurss.lesson10.lecture.symbol_streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadCharsFromFile {

	public static void main(String[] args) {

		File input = new File("src/lv/akurss/lesson10/lecture/symbol_streams/test.txt");
		
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
