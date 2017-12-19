package lv.akurss.lesson4.lecture.practice;

public class Main {

	public static void main(String[] args) {
		Guitar guitar1 = new Guitar(100.00, "Squire", 6);
		Keyboard keyboard = new Keyboard(250.00, "Yamaha", 48);
		DrumSticks drumSticks = new DrumSticks(15.00, "Sabian");
		
		Basket basket = new Basket();
		basket.addToBasket(guitar1);
		basket.addToBasket(keyboard);
		basket.addToBasket(drumSticks);
		basket.printTotal();
	}
}
