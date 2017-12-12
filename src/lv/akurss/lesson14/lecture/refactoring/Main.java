package lv.akurss.lesson14.lecture.refactoring;


import lv.akurss.lesson14.lecture.refactoring.command.*;
import lv.akurss.lesson14.lecture.refactoring.model.Expense;

import java.util.*;

public class Main {

	public static final String STORE_PATH = "./expenses.txt";

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to your budget planner!");
		System.out.println("Enter you expenses like amount:category or amount:category:description ");
		Scanner scanner = new Scanner(System.in);
		List<Expense> expenses = new ArrayList<>();
		
		Map<String, Command> commands = new HashMap<>();
		commands.put("history", new PrintHistoryCommand(expenses));
		
		new LoadFromFileCommand(expenses).execute("");
		
		while (true) {
			String commandStr = scanner.nextLine();
			if (commandStr.equals("quit")) {
				System.out.println("See you later!");
				break;
			}
			
			if (commands.containsKey(commandStr.split(" ", 2)[0])) {
				commands.get(commandStr).execute(commandStr);
			} else {
				new CreateExpenseCommand(expenses).execute(commandStr);
			}
		}
		
		new WriteToFileCommand(expenses).execute("");
		
	}
	

	
}
