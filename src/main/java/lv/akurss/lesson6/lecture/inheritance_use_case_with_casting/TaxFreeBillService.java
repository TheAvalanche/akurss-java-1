package lv.akurss.lesson6.lecture.inheritance_use_case_with_casting;

public class TaxFreeBillService implements BillService {

	private double totalForInstruments;
	private double totalForOther;
	private double discount;

	@Override
	public void addToBill(Item item) {
		if (item.isInstrument()) {
			totalForInstruments = totalForInstruments + item.getPrice();
		} else {
			totalForOther = totalForOther + item.getPrice();
		}

		if (item instanceof Guitar) {
			System.out.println("Guitar discount");
			discount = discount + (item.getPrice() / 100 * ((Guitar) item).getStringCount());
		}
	}

	@Override
	public void total() {
		System.out.println("You should pay: " + totalForInstruments + "$ for instruments");
		System.out.println("And: " + totalForOther + "$ for all the rest");
		System.out.println("And: " + discount + "$ discount");
	}
	
}
