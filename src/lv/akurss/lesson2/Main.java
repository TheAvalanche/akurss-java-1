package lv.akurss.lesson2;

public class Main {

	public static void main(String[] args) {
		
		rotateAndPrint(args);
					
	}
	
	static void rotateAndPrint(String[] texts) {
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
	}
}
