package lv.akurss.lesson7.lecture.exception;

import java.util.Scanner;

public class ThrowingUncheckedException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int input = scanner.nextInt();
			
			if (input < 0) {
				throw new RuntimeException("You have entered invalid value");
			}
			System.out.println(input);
		}
	}
	
}
