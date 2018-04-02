package lv.akurss.refactoring.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExpenseConverter {
	
	public static Expense fromString(String string) {
		String[] parts = string.split(":");
		if (parts.length == 2) {
			return new Expense(new BigDecimal(parts[0]), Category.valueOf(parts[1]));
		} else {
			return new Expense(new BigDecimal(parts[0]), Category.valueOf(parts[1]), parts[2]);
		}
	}
	
	public static String toString(Expense ex) {
		return Stream
				.of(ex.getAmount(), ex.getCategory(), ex.getDescription())
				.filter(Objects::nonNull)
				.map(Object::toString)
				.collect(Collectors.joining(":"));
		
	}
	
}
