package lv.akurss.refactoring.command;

import lv.akurss.refactoring.model.Expense;
import lv.akurss.refactoring.model.ExpenseConverter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static lv.akurss.refactoring.Main.STORE_PATH;

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
