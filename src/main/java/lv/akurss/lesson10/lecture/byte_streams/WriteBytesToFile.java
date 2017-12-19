package lv.akurss.lesson10.lecture.byte_streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesToFile {

	public static void main(String[] args) {
		
		String text = "Some Text";
		byte[] bytes = text.getBytes();

		File output = new File("src/lv/akurss/lesson10/lecture/byte_streams/test.txt");
		
		try (OutputStream fileOutputStream = new FileOutputStream(output)){
			
			for (byte eachByte : bytes) {
				fileOutputStream.write(eachByte);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
