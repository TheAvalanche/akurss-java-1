package lv.akurss.lesson14.lecture.refactoring.commands;


import lv.akurss.lesson14.lecture.refactoring.model.ExpenseConverter;
import lv.akurss.lesson14.lecture.refactoring.model.Expense;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class WriteToFileCommand implements Command {
	
	private List<Expense> expenses;
	
	public WriteToFileCommand(List<Expense> expenses) {
		this.expenses = expenses;
	} 
	
	@Override
	public void execute() throws IOException {
		Files.write(Paths.get("./expenses.txt"), 
				expenses.stream()
						.map(ExpenseConverter::toString)
						.collect(Collectors.toList()));
	}
	
}
