package lv.akurss.lesson7.lecture._1_files;

import java.io.File;

public class DirectoryExample {

	public static void main(String[] args) {
		String path = "src\\main\\java\\lv\\akurss\\lesson7\\lecture\\_1_files\\test";
		File folder = new File(path);
		
		if (!folder.exists()) {
			folder.mkdir();
		}

		System.out.println(folder.isDirectory());
		System.out.println(folder.getParent());
		folder.delete();
		
		listFiles(new File("."));
	}
	
	private static void listFiles(File folder) {
		File[] files = folder.listFiles();
		if (files == null) {
			return;
		}
		
		for (File f : files) {
			if (f.isDirectory()) {
				System.out.println("Directory: " + f.getName());
				listFiles(f);
			} else {
				System.out.println("File: " + f.getName());
			}
			
		}
	}
	
}
