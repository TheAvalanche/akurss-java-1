package lv.akurss.lesson11.lecture.generics;

public class GenericClassExample {

	public static void main(String[] args) {
		Box<Long> v1 = new Box<>(1L, 1000L);
		Box<Double> v2 = new Box<>(1L, 20.99);

		System.out.println(v1.getValue());
		System.out.println(v2.getValue());
	}

	public static class Box<E> {
		private Long id;
		private E value;
	
		public Box(Long id, E value) {
			this.id = id;
			this.value = value;
		}
		
		public E getValue() {
			return value;
		}
	}
}
