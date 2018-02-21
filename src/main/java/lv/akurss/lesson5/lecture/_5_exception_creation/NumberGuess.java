package lv.akurss.lesson5.lecture._5_exception_creation;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int random = new Random().nextInt(100);
		
		while (true) {
			
			try {
				int input = scanner.nextInt();
				guess(random, input);
				break;
			} catch (NumberNotMatchedException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				scanner.next();
			}
		}
	}
	
	public static void guess(int random, int input) throws NumberNotMatchedException {
		if (input > random) {
			throw new NumberNotMatchedException("Bigger, than needed");
		} else if (input < random) {
			throw new NumberNotMatchedException("Smaller, than needed");
		} else {
			System.out.println("Guessed!");
		}
	}
	
}
