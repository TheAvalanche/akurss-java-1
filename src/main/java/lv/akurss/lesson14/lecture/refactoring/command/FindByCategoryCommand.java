package lv.akurss.lesson14.lecture.refactoring.command;

import lv.akurss.lesson14.lecture.refactoring.model.Category;
import lv.akurss.lesson14.lecture.refactoring.model.Expense;

import java.util.List;

public class FindByCategoryCommand implements Command {
	
	private List<Expense> expenses;

	public FindByCategoryCommand(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	@Override
	public void execute(String commandStr) throws Exception {
		try {
			Category category = Category.valueOf(commandStr.split(" ")[1]);
			expenses.stream().filter(it -> it.getCategory().equals(category)).forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Invalid input for 'category' command");
		}
	}
}
