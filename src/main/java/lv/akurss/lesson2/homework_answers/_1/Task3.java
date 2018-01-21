package lv.akurss.lesson2.homework_answers._1;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		if (input % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
	
} 
