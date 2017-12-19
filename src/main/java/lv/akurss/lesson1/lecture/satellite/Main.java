package lv.akurss.lesson1.lecture.satellite;

public class Main {
	public static void main(String[] args) {
		
		int radius = 35786 + 6378;
		double length= 2 * 3.14 * radius;
		double speedPerHour = length / 24;
		double speedPerSecond = speedPerHour / 3600;
		
		System.out.println(speedPerSecond);
	}
}
