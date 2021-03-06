package lv.akurss.refactoring.command;

import lv.akurss.refactoring.model.Expense;
import lv.akurss.refactoring.model.ExpenseConverter;
import lv.akurss.refactoring.validators.ExpenseStringValidator;

import java.util.ArrayList;
import java.util.List;

public class CreateExpenseCommand implements Command {
	
	private List<Expense> expenses;

	public CreateExpenseCommand(List<Expense> expenses) {
		this.expenses = expenses;
	}

	@Override
	public void execute(String commandStr) throws Exception {
		boolean valid = validate(commandStr);
		if (valid) {
			expenses.add(ExpenseConverter.fromString(commandStr));
		}
	}

	private boolean validate(String str) {
		List<String> errors = new ArrayList<>();
		new ExpenseStringValidator().validate(str, errors);
		if (!errors.isEmpty()) {
			errors.forEach(System.out::println);
			return false;
		}
		return true;
	}
}
