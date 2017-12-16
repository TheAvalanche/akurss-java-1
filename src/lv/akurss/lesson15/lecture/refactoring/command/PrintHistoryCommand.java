package lv.akurss.lesson15.lecture.refactoring.command;

import lv.akurss.lesson15.lecture.refactoring.model.Expense;

import java.util.Comparator;
import java.util.List;

public class PrintHistoryCommand implements Command {
	
	private List<Expense> expenses;

	public PrintHistoryCommand(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	@Override
	public void execute(String commandStr) {
		expenses.stream()
				.sorted(Comparator.comparing(Expense::getAmount))
				.forEach(System.out::println);
	}
}
