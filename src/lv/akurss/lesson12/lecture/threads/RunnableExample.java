package lv.akurss.lesson12.lecture.threads;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new PrintingRunnable("NA"));
		Thread thread2 = new Thread(new PrintingRunnable("na"));

		thread1.start();
		thread2.start();
	}

	private static class PrintingRunnable implements Runnable {
		private String message;

		public PrintingRunnable(String message) {
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
