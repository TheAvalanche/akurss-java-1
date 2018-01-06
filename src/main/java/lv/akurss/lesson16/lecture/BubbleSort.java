package lv.akurss.lesson16.lecture;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 9, 2, 4, 18, 21, 99, 15, 108};
		
		// i == last element
		for (int i = arr.length - 1; i > 0; i--) {
			
			for (int k = 0; k < i; k++) {
				if (arr[k] > arr[k + 1]) {
					int b = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = b;					
				}
			}
			
		}

		System.out.println(Arrays.toString(arr));
		
	}
	
	
}
