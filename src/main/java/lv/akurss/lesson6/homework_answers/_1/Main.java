package lv.akurss.lesson6.homework_answers._1;

import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to your budget planner!");
		System.out.println("Enter you expenses like amount:name:category ");
		Scanner scanner = new Scanner(System.in);
		List<Expense> list = new ArrayList<>();
		
		while (true) {
			try {
				String s = scanner.nextLine();
				if (s.equals("quit")) {
					System.out.println("See you later!");
					break;
				}
				
				if (s.equals("history")) {
					printHistory(list);
					continue;
				}
				
				Expense expense = createExpense(s);
				list.add(expense);
			} catch (Exception e) {
				System.out.println("Wrong input. " + e.getMessage() + ". Try again.");
			}
		}
		
	}
	
	
	private static Expense createExpense(String s) {
		String[] parts = s.split(":");
		
		if (parts.length != 3) {
			throw new IllegalArgumentException("One line should contain 3 parts, with ':' separator");
		}
		
		BigDecimal amount = new BigDecimal(parts[0]);
		String name = parts[1];
		Category category = Category.valueOf(parts[2]);
				
		Expense ex = new Expense(amount, name, category);
		System.out.println("New expense created: " + ex);
		return ex;
	}
	
	private static void printHistory(List<Expense> expenses) {
		Collections.sort(expenses);
		for (Expense expense : expenses) {
			System.out.println(expense);
		}
	}

	private static void printInfo(String key, Map<String, Expense> expenses) {
		System.out.println(expenses.get(key));
	}


}
