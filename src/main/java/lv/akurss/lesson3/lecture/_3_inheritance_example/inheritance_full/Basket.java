package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_full;

public class Basket {
	
	private double total;
	private double totalInstruments;
	
	public void addToBasket(Item item) {
		if (item.isInstrument()) {
			totalInstruments = totalInstruments + item.getPrice();
		}
		
		total = total + item.getPrice();
	}
	
	public void printTotal() {
		System.out.println("Basket amount: " + total + "$");
		System.out.println("Instrument amount: " + totalInstruments + "$");
	}
	
}
