package lv.akurss.lesson2.homework_answers._1;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		if (input % 5 == 0 && input % 3 == 0) {
			System.out.println("FizzBuzz");
		} else if (input % 5 == 0) {
			System.out.println("Buss");
		} else if (input % 3 == 0) {
			System.out.println("Fizz");
		}
	}
	
} 
