package lv.akurss.lesson10.lecture.closing_streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OldCloseExample {

	public static void main(String[] args) {
		
		File file = new File("src/lv/akurss/lesson10/lecture/closing_streams/test.txt");
		OutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write("Some Text".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			file.delete();
		}
	}
	
}
