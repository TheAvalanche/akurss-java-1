package lv.akurss.lesson14.lecture.refactoring.commands;


import lv.akurss.lesson14.lecture.refactoring.model.ExpenseConverter;
import lv.akurss.lesson14.lecture.refactoring.model.Expense;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LoadFromFileCommand implements Command {
	
	private List<Expense> expenses;
	
	public LoadFromFileCommand(List<Expense> expenses) {
		this.expenses = expenses;
	} 
	
	@Override
	public void execute() throws IOException {
		Path path = Paths.get("./expenses.txt");
		if (Files.exists(path)) {
			Files.lines(path).forEach(line -> expenses.add(ExpenseConverter.fromString(line)));
		}
	}
	
}
