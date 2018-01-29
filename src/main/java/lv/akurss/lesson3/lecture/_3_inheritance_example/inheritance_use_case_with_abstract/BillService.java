package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_use_case_with_abstract;

public class BillService {
	
	private double totalForInstruments;
	private double totalForOther;
	
	public void addToBill(Item item) {
		if (item.isInstrument()) {
			totalForInstruments = totalForInstruments + item.getPrice();
		} else {
			totalForOther = totalForOther + item.getPrice();
		}
	}
	
	public void total() {
		System.out.println("You should pay: " + totalForInstruments + "$ for instruments");
		System.out.println("And: " + totalForOther + "$ for all the rest");
		
	}
	
}
