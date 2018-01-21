package lv.akurss.lesson2.homework_answers._1;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		if (input > 0) {
			System.out.println("Number is positive");
		} else if (input < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is 0");
		}
	}
	
} 
