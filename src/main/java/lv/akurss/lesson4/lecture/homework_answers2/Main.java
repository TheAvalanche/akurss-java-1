package lv.akurss.lesson4.lecture.homework_answers2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExpenseCalculator expenseCalculator = new ExpenseCalculator();
		
		while (true) {
			double expense = scanner.nextDouble();
			
			Expense ex = new Expense(expense, "");
			
			expenseCalculator.addToExpenses(ex);
			expenseCalculator.printTotal();
		}
	}
}
