package lv.akurss.lesson2.lecture;

import static java.lang.Integer.toBinaryString;

public class BinaryOperators {

	public static void main(String[] args) {
		System.out.println(toBinaryString(0b11110000 & 0b11001100));
		System.out.println(toBinaryString(0b11110000 | 0b11001100));
		System.out.println(toBinaryString(0b11110000 ^ 0b11001100));
		System.out.println(toBinaryString(~0b11110000));
		System.out.println(toBinaryString(0b11110001 << 1));
		System.out.println(toBinaryString(0b11110001 >> 1));
		System.out.println(toBinaryString(0b11110001 >>> 1));
	}
	
}
