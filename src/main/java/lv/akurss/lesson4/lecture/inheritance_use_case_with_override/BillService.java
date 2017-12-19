package lv.akurss.lesson4.lecture.inheritance_use_case_with_override;

public class BillService {
	
	private double total;
	
	public void addToBill(Item item) {
		total = total + item.getPrice();
	}
	
	public void total() {
		System.out.println("You should pay: " + total + "$");
		
	}
	
}
