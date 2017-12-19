package lv.akurss.wisdom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WisdomMachine {

	private static List<Integer> range = new ArrayList<>();
	
	static {
		addRange(32, 32);
		addRange(33, 33);
		addRange(46, 46);
		//addRange(48, 57);
		addRange(65, 90);
		addRange(97, 122);
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your question: ");
		reader.next();
		System.out.println("===================================");
		System.out.println("Looking for an answer... ");
		
		char[] phrase = new char[]{83, 116, 117, 100, 121, 32, 97, 116, 32, 65, 75, 117, 114, 115, 115, 46, 108, 118};
		char[] key = new char[18];
		boolean keyFound = false;
		while (!keyFound) {
			keyFound = true;
			Thread.sleep(50);
			System.out.print("\r\u001B[32m");
			for (int i = 0; i < key.length; i++) {
				char c = key[i];
				if (c != phrase[i]) {
					c = (char) getRandomInRange();
					key[i] = c;
					keyFound = false;
				}
				System.out.print(c);
			}
		}
		Thread.sleep(500);
		
		System.out.print("\n");
		System.out.println("\u001B[37m===================================");
		Thread.sleep(500);
		System.out.println("\u001B[31mAnswer found: " + new String(key) + "!!!");
		Thread.sleep(500);
		System.out.println("\u001B[37m===================================");
		Thread.sleep(2000);
		
	}

	private static void addRange(int min, int max) {
		for (int i = min; i <= max; i++) {
			range.add(i);
		}
	}

	private static int getRandomInRange() {
		return range.get(new Random().nextInt(range.size()));
	}
}
