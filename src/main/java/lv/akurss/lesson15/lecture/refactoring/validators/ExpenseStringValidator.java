package lv.akurss.lesson15.lecture.refactoring.validators;

import java.util.List;

public class ExpenseStringValidator implements Validator<String> {
	
	@Override
	public void validate(String str, List<String> errors) {
		String[] parts = str.split(":");

		if (parts.length < 2) {
			errors.add("Invalid input. Should contain min 2 parts, separated with ':'");
		}
		if (parts.length > 3) {
			errors.add("Invalid input. Should contain max 3 parts, separated with ':'");
		}
		
		new ExpenseAmountValidator().validate(parts[0], errors);
		new ExpenseCategoryValidator().validate(parts[1], errors);
		
	}
	
}
