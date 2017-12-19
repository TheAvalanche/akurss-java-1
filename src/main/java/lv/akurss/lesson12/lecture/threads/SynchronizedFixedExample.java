package lv.akurss.lesson12.lecture.threads;

public class SynchronizedFixedExample {


	public static void main(String[] args) {
		Storage storage = new Storage();
		
		Runnable runnable1 = new AddRunnable(storage);
		Runnable runnable2 = new SubtractRunnable(storage);
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		
		while (thread1.isAlive() || thread2.isAlive()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(storage.getSum());
	}
	
	private static class Storage {
		private int sum;

		public Storage() {
			this.sum = 0;
		}

		public synchronized int getSum() {
			return sum;
		}

		public synchronized void setSum(int sum) {
			this.sum = sum;
		}
	}
	
	private static class AddRunnable implements Runnable {
		
		private Storage storage;

		private AddRunnable(Storage storage) {
			this.storage = storage;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Adding 10");
				storage.setSum(storage.getSum() + 10);
			}
		}
	}

	private static class SubtractRunnable implements Runnable {

		private Storage storage;

		private SubtractRunnable(Storage storage) {
			this.storage = storage;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Subtracting 10");
				storage.setSum(storage.getSum() - 10);
			}
		}
	}
	
}
