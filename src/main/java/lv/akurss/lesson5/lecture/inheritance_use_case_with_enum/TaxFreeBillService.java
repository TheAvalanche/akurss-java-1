package lv.akurss.lesson5.lecture.inheritance_use_case_with_enum;

public class TaxFreeBillService implements BillService {

	private double totalForInstruments;
	private double totalForOther;

	@Override
	public void addToBill(Item item) {
		if (item.isInstrument()) {
			totalForInstruments = totalForInstruments + item.getPrice();
		} else {
			totalForOther = totalForOther + item.getPrice();
		}
	}

	@Override
	public void total() {
		System.out.println("You should pay: " + totalForInstruments + "$ for instruments");
		System.out.println("And: " + totalForOther + "$ for all the rest");
	}
	
}
