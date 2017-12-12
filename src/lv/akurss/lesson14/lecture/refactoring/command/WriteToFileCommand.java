package lv.akurss.lesson14.lecture.refactoring.command;

import lv.akurss.lesson14.lecture.refactoring.model.ExpenseConverter;
import lv.akurss.lesson14.lecture.refactoring.model.Expense;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static lv.akurss.lesson14.lecture.refactoring.Main.STORE_PATH;

public class WriteToFileCommand implements Command {
	
	private List<Expense> expenses;

	public WriteToFileCommand(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	public void execute(String commandStr) throws Exception {
		Files.write(Paths.get(STORE_PATH), expenses.stream()
				.map(ExpenseConverter::toString)
				.collect(Collectors.toList()));
	}
}
