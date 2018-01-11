package lv.akurss.lesson14.lecture.refactoring.command;

import lv.akurss.lesson14.lecture.refactoring.model.Expense;

import java.util.Comparator;
import java.util.List;

public class FindMinCommand implements Command {
	
	private List<Expense> expenses;

	public FindMinCommand(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	@Override
	public void execute(String commandStr) throws Exception {
		expenses.stream().min(Comparator.comparing(Expense::getAmount)).ifPresent(System.out::println);
	}
}
