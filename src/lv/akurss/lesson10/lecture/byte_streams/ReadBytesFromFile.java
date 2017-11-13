package lv.akurss.lesson10.lecture.byte_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytesFromFile {

	public static void main(String[] args) {
		
		File input = new File("src/lv/akurss/lesson10/lecture/byte_streams/test.txt");
		
		try (FileInputStream fileInputStream = new FileInputStream(input)){

			int symbol;
			while ((symbol = fileInputStream.read()) != -1) {
				System.out.print(symbol);
				//System.out.print((char) symbol); casting to char to transform bytes to symbols
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
