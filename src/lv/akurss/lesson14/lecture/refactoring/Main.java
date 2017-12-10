package lv.akurss.lesson14.lecture.refactoring;

import lv.akurss.lesson14.lecture.refactoring.commands.Command;
import lv.akurss.lesson14.lecture.refactoring.commands.LoadFromFileCommand;
import lv.akurss.lesson14.lecture.refactoring.commands.PrintHistoryCommand;
import lv.akurss.lesson14.lecture.refactoring.commands.WriteToFileCommand;
import lv.akurss.lesson14.lecture.refactoring.model.Expense;
import lv.akurss.lesson14.lecture.refactoring.model.ExpenseConverter;
import lv.akurss.lesson14.lecture.refactoring.validator.ExpenseStringValidator;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to your budget planner!");
		System.out.println("Enter you expenses like amount:category:description");
		Scanner scanner = new Scanner(System.in);
		List<Expense> list = new ArrayList<>();
		
		Map<String, Command> commands = new HashMap<>();
		commands.put("history", new PrintHistoryCommand(list));
		
		new LoadFromFileCommand(list).execute();
		
		while (true) {
			String s = scanner.nextLine();
			if (s.equals("quit")) {
				break;
			}
			
			if (commands.containsKey(s)) {
				commands.get(s).execute();
				continue;
			}

			boolean valid = validate(s);
			if (valid) {
				list.add(ExpenseConverter.fromString(s));
			}
		}
		
		new WriteToFileCommand(list).execute();
	}
	
	private static boolean validate(String str) {
		List<String> errors = new ArrayList<>();
		new ExpenseStringValidator().validate(str, errors);
		if (!errors.isEmpty()) {
			errors.forEach(System.out::println);
			return false;
		}
		return true;
	}
}
