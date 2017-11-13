package lv.akurss.lesson10.lecture.byte_streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytesToFile {

	public static void main(String[] args) {
		
		String text = "Some Text";
		byte[] bytes = text.getBytes();

		File output = new File("src/lv/akurss/lesson10/lecture/byte_streams/test.txt");
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(output)){
			
			for (byte eachByte : bytes) {
				fileOutputStream.write(eachByte);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
