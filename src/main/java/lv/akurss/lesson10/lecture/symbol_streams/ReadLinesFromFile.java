package lv.akurss.lesson10.lecture.symbol_streams;

import java.io.*;

public class ReadLinesFromFile {

	public static void main(String[] args) {

		File input = new File("src/lv/akurss/lesson10/lecture/symbol_streams/test.txt");
		
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
