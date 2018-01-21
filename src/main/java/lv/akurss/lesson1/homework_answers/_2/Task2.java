package lv.akurss.lesson1.homework_answers._2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Enter the amount of seconds between lightning light and sound:");
		Scanner scanner = new Scanner(System.in);
		int seconds = scanner.nextInt();
		int distanceInMeters = seconds * 330;
		double distanceInKilometers = distanceInMeters / 1000.0;
		System.out.println("The lightning stroke was " + distanceInMeters + "m (" + distanceInKilometers + "km) away");
	}
	
}
