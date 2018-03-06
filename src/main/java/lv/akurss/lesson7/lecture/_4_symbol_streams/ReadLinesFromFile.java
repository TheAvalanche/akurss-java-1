package lv.akurss.lesson7.lecture._4_symbol_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinesFromFile {

	public static void main(String[] args) {
		File input = new File("src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_4_symbol_streams\\test.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.print(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
