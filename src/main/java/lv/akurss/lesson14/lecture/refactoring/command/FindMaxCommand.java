package lv.akurss.lesson14.lecture.refactoring.command;

import lv.akurss.lesson14.lecture.refactoring.model.Expense;

import java.util.Comparator;
import java.util.List;

public class FindMaxCommand implements Command {
	
	private List<Expense> expenses;

	public FindMaxCommand(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	@Override
	public void execute(String commandStr) throws Exception {
		expenses.stream().max(Comparator.comparing(Expense::getAmount)).ifPresent(System.out::println);
	}
}
