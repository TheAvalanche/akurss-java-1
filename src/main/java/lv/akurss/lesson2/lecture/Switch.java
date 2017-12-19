package lv.akurss.lesson2.lecture;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Please, enter grade.");
		Scanner input = new Scanner(System.in);
		char grade = input.nextLine().charAt(0);

		switch(grade) {
			case 'A' :
				System.out.println("Excellent!");
				break;
			case 'B' :
			case 'C' :
				System.out.println("Well done");
				break;
			case 'D' :
				System.out.println("You passed");
			case 'F' :
				System.out.println("Better try again");
				break;
			default :
				System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
	}
	
}
