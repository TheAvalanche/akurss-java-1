package lv.akurss.lesson14.lecture.refactoring.validator;

import lv.akurss.lesson14.lecture.refactoring.model.Category;

import java.util.Arrays;
import java.util.List;

public class ExpenseCategoryValidator {

	public void validate(String str, List<String> errors) {
		try {
			Category.valueOf(str);
		} catch (IllegalArgumentException e) {
			errors.add("Invalid input. Cannot parse category. Should be one of: " + Arrays.toString(Category.values()));
		}
	}
}
