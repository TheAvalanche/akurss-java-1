package lv.akurss.lesson10.lecture.file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		String path = "src/lv/akurss/lesson10/lecture/file/test.txt";
		File file = new File(path);

		System.out.println(file.exists());
		
		if (!file.exists()) {
			file.createNewFile();
		}

		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());

		System.out.println(file.length());
		System.out.println(file.getTotalSpace() / Math.pow(2, 30) + " GB");
		System.out.println(file.getFreeSpace() / Math.pow(2, 30) + " GB");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());

		File renamedFile = new File("src/lv/akurss/lesson10/lecture/file/test_renamed.txt");
		
		System.out.println(file.renameTo(renamedFile));
		System.out.println(renamedFile.delete());
	}
	
	
}
