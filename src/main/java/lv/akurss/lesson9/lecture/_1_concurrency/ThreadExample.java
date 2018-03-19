package lv.akurss.lesson9.lecture._1_concurrency;

public class ThreadExample {


	public static void main(String[] args) {
		PrintingThread thread1 = new PrintingThread("bla");
		PrintingThread thread2 = new PrintingThread("BLA");
		PrintingThread thread3 = new PrintingThread("blaaaa");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	
	private static class PrintingThread extends Thread {
		
		private String message;

		public PrintingThread(String message) {
			this.message = message;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {

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
