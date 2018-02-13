package lv.akurss.lesson5.lecture._4_throwing_exception;

import java.util.Scanner;

public class ThrowingCheckedException {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int input = scanner.nextInt();
			
			if (input < 0) {
				throw new Exception("You have entered invalid value");
			}
			System.out.println(input);
		}
	}
	
}
