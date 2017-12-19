package lv.akurss.lesson10.lecture.file;

import java.io.File;

public class DirectoryExample {

	public static void main(String[] args) {
		String path = "src/lv/akurss/lesson10/lecture/file/folder";
		File folder = new File(path);

		System.out.println(folder.exists());

		if (!folder.exists()) {
			folder.mkdir();
		}

		System.out.println(folder.isDirectory());
		System.out.println(folder.getParent());
		System.out.println(folder.delete());
		
		listFiles(new File("."));
	}

	private static void listFiles(File file) {
		File[] files = file.listFiles();
		if (files == null) {
			return;
		}
		for (File f : files) {
			if (f.isDirectory()) {
				System.out.println("Directory: " + f.getName());
				listFiles(f);
			} else {
				System.out.println("- " + f.getName());
			}
		}
	}

}
