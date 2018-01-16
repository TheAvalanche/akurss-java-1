package lv.akurss.lesson1.homework_answers;

import java.util.Scanner;

public class Task1Complex {

	public static void main(String[] args) {
		System.out.println("Enter the amount you can collect in month:");
		Scanner scanner = new Scanner(System.in);
		int sumPerMonth = scanner.nextInt();
		int sumPerYear = sumPerMonth * 12;
		int total = 1000000;
		int yearsToCollect = total / sumPerYear;
		System.out.println("You need " + yearsToCollect + " years to collect 1M dollars. Good luck...");
	}
	
}
