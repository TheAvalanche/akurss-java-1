package lv.akurss.lesson2.lecture;

public class WorkWithArrays2 {

	public static void main(String[] args) {
		int[] heights = {8838, 8318, 7936, 8365, 8848, 8054, 8788, 8569, 8342, 8124};
		
		int max = 0;
		for (int i = 0; i < heights.length; i++) {
			int height = heights[i];
			if (height > max) {
				max = height;
			}
		}
		System.out.println("Maximum height is: " + max);
	}
	
}
