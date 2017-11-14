package lv.akurss.lesson10.lecture.byte_streams;

import java.io.*;

public class CopyBytesToFile {

	public static void main(String[] args) {
		
		File input = new File("src/lv/akurss/lesson10/lecture/byte_streams/test.txt");
		File output = new File("src/lv/akurss/lesson10/lecture/byte_streams/test2.txt");

		try (InputStream fileInputStream = new FileInputStream(input);
			 OutputStream fileOutputStream = new FileOutputStream(output)){

			int symbol;
			while ((symbol = fileInputStream.read()) != -1) {
				fileOutputStream.write(symbol);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
