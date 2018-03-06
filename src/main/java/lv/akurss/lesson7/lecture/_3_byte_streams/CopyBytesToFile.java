package lv.akurss.lesson7.lecture._3_byte_streams;

import java.io.*;

public class CopyBytesToFile {

	public static void main(String[] args) {
		
		File input = new File("src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_3_byte_streams\\test.txt");
		File output = new File("ssrc\\main\\java\\lv\\akurss\\lesson7\\lecture\\_3_byte_streams\\test2.txt");

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
