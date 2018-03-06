package lv.akurss.lesson7.lecture._3_byte_streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesToFile {

	public static void main(String[] args) {
		
		byte[] bytes = {72, 101, 108, 108, 111};

		File output = new File("src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_3_byte_streams\\test.txt");
		
		try (OutputStream stream = new FileOutputStream(output)) {
			
			stream.write(bytes);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
