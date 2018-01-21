package lv.akurss.lesson1.homework_answers._3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Enter your weight:");
		Scanner scanner = new Scanner(System.in);
		int weight = scanner.nextInt();
		double moonWeight = weight * 0.17;
		System.out.println("On the moon you would weight " + moonWeight + "kg. Дрыщ.");
	}
	
}
