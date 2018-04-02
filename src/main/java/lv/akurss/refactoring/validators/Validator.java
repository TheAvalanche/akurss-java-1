package lv.akurss.refactoring.validators;

import java.util.List;

public interface Validator<T> {
	
	void validate(T obj, List<String> errors);
	
}
