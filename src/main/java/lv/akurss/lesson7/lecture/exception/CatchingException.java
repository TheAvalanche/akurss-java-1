package lv.akurss.lesson7.lecture.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchingException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			try {
				int input = scanner.nextInt();
				System.out.println(input);
			} catch (InputMismatchException e) {
				System.out.println("Exception occured: ");
				e.printStackTrace();
				scanner.next();
			}
		}
	}
	
}
