package lv.akurss.lesson2.lecture;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		int random = new Random().nextInt(100);
		System.out.println("I thought about some number from 0 to 100. Try to guess it.");

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int input = scanner.nextInt();
			
			if (input > random) {
				System.out.println("You entered bigger number, than needed.");
			} else if (input < random) {
				System.out.println("You entered smaller number, than needed.");
			} else {
				System.out.println("You guessed!");
				break;
			}
		}
	}
	
}
