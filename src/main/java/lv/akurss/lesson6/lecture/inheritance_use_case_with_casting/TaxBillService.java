package lv.akurss.lesson6.lecture.inheritance_use_case_with_casting;

public class TaxBillService implements BillService {

	private double totalForInstruments;
	private double totalForOther;
	private double discount;

	@Override
	public void addToBill(Item item) {
		if (item.isInstrument()) {
			totalForInstruments = totalForInstruments + item.getPrice() + calcTax(item);
		} else {
			totalForOther = totalForOther + item.getPrice() + calcTax(item);
		}
		
		if (item instanceof Guitar) {
			System.out.println("Guitar discount");
			discount = discount + (item.getPrice() / 100 * ((Guitar) item).getStringCount());
		}
	}
	
	private double calcTax(Item item) {
		return item.getPrice() * 0.21;
	}

	@Override
	public void total() {
		System.out.println("You should pay: " + totalForInstruments + "$ for instruments");
		System.out.println("And: " + totalForOther + "$ for all the rest");
		System.out.println("And: " + discount + "$ discount");
	}
	
}
