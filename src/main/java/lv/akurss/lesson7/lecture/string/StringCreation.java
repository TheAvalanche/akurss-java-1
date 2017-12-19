package lv.akurss.lesson7.lecture.string;

public class StringCreation {

	public static void main(String[] args) {
		String str1 = "Welcome";
		String str2 = "Welcome";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("Welcome");
		String str4 = new String("Welcome");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
	}
	
}
