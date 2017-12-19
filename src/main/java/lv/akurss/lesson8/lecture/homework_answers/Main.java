package lv.akurss.lesson8.lecture.homework_answers;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to your budget planner!");
		System.out.println("Enter you expenses like amount:name:category ");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				String s = scanner.next();
				if (s.equals("quit")) {
					System.out.println("See you later!");
					break;
				}
				
				createExpense(s);
			} catch (Exception e) {
				System.out.println("Wrong input. " + e.getMessage() + ". Try again.");
			}
		}
		
	}
	
	
	private static void createExpense(String s) {
		String[] parts = s.split(":");
		
		if (parts.length != 3) {
			throw new IllegalArgumentException("One line should contain 3 parts, with ':' separator");
		}
		
		BigDecimal amount = new BigDecimal(parts[0]);
		String name = parts[1];
		Category category = Category.valueOf(parts[2]);
				
		Expense ex = new Expense(amount, name, category);
		System.out.println("New expense created: " + ex);
	}


}
