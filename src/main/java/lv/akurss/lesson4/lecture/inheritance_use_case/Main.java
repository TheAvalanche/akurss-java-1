package lv.akurss.lesson4.lecture.inheritance_use_case;

public class Main {

	public static void main(String[] args) {
		Item guitar = new Guitar(50.00, "Fender", 6);
		Item guitar2 = new Guitar(150.00, "Gibson", 6);
		
		Item keyboard = new Keyboard(100.00, "Korg", 48);
		Item keyboard2 = new Keyboard(500.00, "Roland", 72);
		
		BillService billService = new BillService();
		billService.addToBill(guitar);
		billService.addToBill(guitar2);
		billService.addToBill(keyboard);
		billService.addToBill(keyboard2);
		billService.total();
				
	}
	
}
