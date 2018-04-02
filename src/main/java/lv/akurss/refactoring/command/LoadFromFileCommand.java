package lv.akurss.refactoring.command;

import lv.akurss.refactoring.model.Expense;
import lv.akurss.refactoring.model.ExpenseConverter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static lv.akurss.refactoring.Main.STORE_PATH;

public class LoadFromFileCommand implements Command {
	
	private List<Expense> expenses;

	public LoadFromFileCommand(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	@Override
	public void execute(String commandStr) throws Exception {
		Path path = Paths.get(STORE_PATH);
		if (Files.exists(path)) {
			Files.lines(path).forEach(line -> expenses.add(ExpenseConverter.fromString(line)));
		}
	}
}
