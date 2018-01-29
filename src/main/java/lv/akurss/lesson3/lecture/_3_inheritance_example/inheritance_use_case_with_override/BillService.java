package lv.akurss.lesson3.lecture._3_inheritance_example.inheritance_use_case_with_override;

public class BillService {
	
	private double total;
	
	public void addToBill(Item item) {
		total = total + item.getPrice();
	}
	
	public void total() {
		System.out.println("You should pay: " + total + "$");
		
	}
	
}
