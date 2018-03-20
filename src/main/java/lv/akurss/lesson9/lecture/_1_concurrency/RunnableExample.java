package lv.akurss.lesson9.lecture._1_concurrency;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new PrintingRunnable("bla"));
		Thread thread2 = new Thread(new PrintingRunnable("BLA"));
		Thread thread3 = new Thread(new PrintingRunnable("blaaaa"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
	
	private static class PrintingRunnable implements Runnable {
		
		private String message;
		
		public PrintingRunnable(String message) {
			this.message = message;
		}
		
		@Override
		public void run() {
			for (int i = 0; i< 10; i ++) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(message);
			}
			
			
		}
		
		
		
	}
	
}
