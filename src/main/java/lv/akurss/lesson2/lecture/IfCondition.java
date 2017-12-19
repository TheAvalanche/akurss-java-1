package lv.akurss.lesson2.lecture;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		System.out.println("Please, enter some number.");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if (number > 100) {
			System.out.println("Number is greater than 100");
		}
		
		System.out.println("You have entered:" + number);
	}
}
