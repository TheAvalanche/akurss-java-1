package lv.akurss.lesson1.homework_answers._1;

public class Task1 {

	public static void main(String[] args) {
		int sumPerMonth = 120;
		int sumPerYear = sumPerMonth * 12;
		int total = 1000000;
		int yearsToCollect = total / sumPerYear;
		System.out.println("You need " + yearsToCollect + " years to collect 1M dollars. Good luck...");
	}
	
}
