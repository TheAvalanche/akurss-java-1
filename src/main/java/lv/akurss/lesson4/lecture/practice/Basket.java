package lv.akurss.lesson4.lecture.practice;

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
