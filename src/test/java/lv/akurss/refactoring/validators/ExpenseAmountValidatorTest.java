package lv.akurss.refactoring.validators;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExpenseAmountValidatorTest {

	@Test
	public void invalidIfEmpty() {
		String input = "";
		List<String> errors = new ArrayList<>();
		new ExpenseAmountValidator().validate(input, errors);

		Assert.assertNotEquals(0, errors.size());
		Assert.assertEquals("Invalid input. Cannot parse amount. Should be decimal number.", errors.get(0));
	}

	@Test
	public void invalidIfNull() {
		String input = null;
		List<String> errors = new ArrayList<>();
		new ExpenseAmountValidator().validate(input, errors);

		Assert.assertNotEquals(0, errors.size());
		Assert.assertEquals("Invalid input. Cannot parse amount. Should be decimal number.", errors.get(0));
	}
	
	@Test
	public void invalidIfNotNumber() {
		String input = "aaa";
		List<String> errors = new ArrayList<>();
		new ExpenseAmountValidator().validate(input, errors);

		Assert.assertNotEquals(0, errors.size());
		Assert.assertEquals("Invalid input. Cannot parse amount. Should be decimal number.", errors.get(0));
	}
	
	@Test
	public void validIfDecimal() {
		String input = "120.50";
		List<String> errors = new ArrayList<>();
		new ExpenseAmountValidator().validate(input, errors);

		Assert.assertEquals(0, errors.size());
	}
	
	@Test
	public void validIfInteger() {
		String input = "120";
		List<String> errors = new ArrayList<>();
		new ExpenseAmountValidator().validate(input, errors);

		Assert.assertEquals(0, errors.size());
	}
	
	
}