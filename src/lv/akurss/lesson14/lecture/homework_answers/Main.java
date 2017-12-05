package lv.akurss.lesson14.lecture.homework_answers;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to your budget planner!");
		System.out.println("Enter you expenses like amount:name:category ");
		Scanner scanner = new Scanner(System.in);
		List<Expense> list = new ArrayList<>();
		Map<String, Expense> lastExpenses = new HashMap<>();
		
		loadExpenses(list);
		
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

				if (s.startsWith("print")) {
					printInfo(s.substring("print".length() + 1), lastExpenses);
					continue;
				}
				
				
				Optional<Expense> expense = createExpense(s);
				expense.ifPresent(e -> {
					saveExpense(s);
					list.add(e);
					lastExpenses.put(e.getName(), e);
				});

			} catch (Exception e) {
				System.out.println("Wrong input. " + e.getMessage() + ". Try again.");
			}
		}
	}
	
	private static void loadExpenses(List<Expense> list) {
		File storage = new File("./expenses.txt");
		if (storage.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader("./expenses.txt"))){
				String line;
				while ((line = reader.readLine()) != null) {
					Optional<Expense> expense = createExpense(line);
					expense.ifPresent(list::add);
				}
			} catch (Exception e) {
				System.out.println("Wrong format, try again");
			}
		}
	}
	
	private static void saveExpense(String s) {
		try (OutputStream outputStream = new FileOutputStream("./expenses.txt", true)){
			outputStream.write((s + System.lineSeparator()).getBytes());
		} catch (Exception e) {
			System.out.println("Wrong format, try again");
		}
	}
	
	private static Optional<Expense> createExpense(String s) {
		String[] parts = s.split(":");
		
		if (parts.length != 3) {
			System.err.println("One line should contain 3 parts, with ':' separator");
			return Optional.empty();
		}
		
		BigDecimal amount = new BigDecimal(parts[0]);
		String name = parts[1];
		Category category = Category.valueOf(parts[2]);
				
		Expense ex = new Expense(amount, name, category);
		System.out.println("New expense created: " + ex);
		return Optional.of(ex);
	}
	
	private static void printHistory(List<Expense> expenses) {
		expenses.stream()
				.sorted(Comparator.comparing(Expense::getAmount))
				.forEach(System.out::println);
	}

	private static void printInfo(String key, Map<String, Expense> expenses) {
		System.out.println(expenses.get(key));
	}


}
