package lv.akurss.lesson9.lecture._1_concurrency;

public class SynchronizedProblemExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		AddRunnable add = new AddRunnable(account);
		SubtractRunnable subtract = new SubtractRunnable(account);
		
		Thread thread1 = new Thread(add);
		Thread thread2 = new Thread(subtract);
		
		thread1.start();
		thread2.start();

		while (thread1.isAlive() || thread2.isAlive()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(account.getSum());
		
	}
	
	
	private static class Account {
		private int sum;
		
		public Account() {
			this.sum = 0;
		}
		
		public int getSum() {
			return sum;
		}
		
		public void setSum(int sum) {
			this.sum = sum;
		}
	}
	
	private static class AddRunnable implements Runnable {
		
		private Account account;
		
		public AddRunnable(Account account) {
			this.account = account;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				account.setSum(account.getSum() + 10);
			}
		}
		
	}

	private static class SubtractRunnable implements Runnable {

		private Account account;

		public SubtractRunnable(Account account) {
			this.account = account;
		}

		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				account.setSum(account.getSum() - 10);
			}
		}

	}
	
	
}
