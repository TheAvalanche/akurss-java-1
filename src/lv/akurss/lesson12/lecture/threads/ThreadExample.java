package lv.akurss.lesson12.lecture.threads;

public class ThreadExample {

	public static void main(String[] args) {
		PrintingThread thread1 = new PrintingThread("NA");
		PrintingThread thread2 = new PrintingThread("na");
		
		thread1.start();
		thread2.start();
	}
	
	
	private static class PrintingThread extends Thread {
		private String message;

		public PrintingThread(String message) {
			this.message = message;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
/*				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/ //uncomment this
				System.out.println(message);
			}
		}
	}
}
