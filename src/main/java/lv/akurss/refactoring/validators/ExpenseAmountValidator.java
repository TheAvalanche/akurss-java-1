package lv.akurss.refactoring.validators;

import java.util.List;

public class ExpenseAmountValidator implements Validator<String> {
	
	@Override
	public void validate(String str, List<String> errors) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException | NullPointerException e) {
			errors.add("Invalid input. Cannot parse amount. Should be decimal number.");
		}

	}
	
}
