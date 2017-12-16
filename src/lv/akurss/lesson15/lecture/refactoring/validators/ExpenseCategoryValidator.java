package lv.akurss.lesson15.lecture.refactoring.validators;

import lv.akurss.lesson15.lecture.refactoring.model.Category;

import java.util.Arrays;
import java.util.List;

public class ExpenseCategoryValidator implements Validator<String> {
	
	@Override
	public void validate(String name, List<String> errors) {
		try {
			Category.valueOf(name);
		} catch (IllegalArgumentException e) {
			errors.add("Invalid input. Cannot parse category. Should be on of: " + Arrays.toString(Category.values()));
		}
	}
	
}
