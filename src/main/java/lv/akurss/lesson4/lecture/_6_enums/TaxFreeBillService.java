package lv.akurss.lesson4.lecture._6_enums;

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
