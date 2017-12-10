package lv.akurss.lesson14.lecture.refactoring.validator;

import java.util.List;

public class ExpenseAmountValidator {

	public void validate(String str, List<String> errors) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException e) {
			errors.add("Invalid input. Cannot parse amount. Should be decimal number");
		}
	}
}
