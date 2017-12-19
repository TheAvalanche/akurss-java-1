package lv.akurss.lesson15.lecture.refactoring.validators;

import java.util.List;

public class ExpenseAmountValidator implements Validator<String> {
	
	@Override
	public void validate(String str, List<String> errors) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException e) {
			errors.add("Invalid input. Cannot parse amount. Should be decimal number.");
		}

	}
	
}
