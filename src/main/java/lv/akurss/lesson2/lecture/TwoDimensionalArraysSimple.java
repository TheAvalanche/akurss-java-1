package lv.akurss.lesson2.lecture;

public class TwoDimensionalArraysSimple {

	public static void main(String[] args) {
		String[][] employees = {
				{"John", "Doe", "Javascript"},
				{"Marta", "Smith", "Scala"},
				{"Alex", "Boring", "Java"}
		};

		System.out.print(employees[0][0]);
		System.out.print(" : ");
		System.out.print(employees[0][1]);
		System.out.print(" : ");
		System.out.print(employees[0][2]);
	}
	
}
