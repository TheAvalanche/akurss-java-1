package lv.akurss.lesson7.lecture._2_closing_streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OldWay {


	public static void main(String[] args) {
		File file = new File("src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_2_closing_streams\\test.txt");

		OutputStream stream = null;
		
		try {
			stream = new FileOutputStream(file);
			stream.write("Hello, world!".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
