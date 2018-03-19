package lv.akurss.lesson8.lecture._3_generics;

public class GenericClassExample {

	public static void main(String[] args) {
		Order<Mobile> o1 = new Order(1L, new Mobile());
		Order<SimCard> o2 = new Order(1L, new SimCard());
		Order<Subscription> o3 = new Order(1L, new Subscription());
		
		SimCard sim = o2.getValue();
	}
	
	
	public static class Order<T> {
		private Long id;
		private T value;
		
		public Order(Long id, T value) {
			this.id = id;
			this.value = value;
		}
		
		public T getValue() {
			return value;
		}
	}
	
	public static class Mobile {
		
	}
	
	public static class Subscription {
		
	}
	
	public static class SimCard {
		
	}
	
}
