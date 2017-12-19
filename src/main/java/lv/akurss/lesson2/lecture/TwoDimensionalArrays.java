package lv.akurss.lesson2.lecture;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		String[][] employees = {
				{"John", "Doe", "Javascript"},
				{"Marta", "Smith", "Scala"},
				{"Alex", "Boring", "Java"}
		};

		for (int i = 0; i < employees.length; i ++) {
			for (int k = 0; k < employees[i].length; k++) {
				System.out.print(" : ");
				System.out.print(employees[i][k]);
			}
			System.out.println("");
		}
	}
	
}
