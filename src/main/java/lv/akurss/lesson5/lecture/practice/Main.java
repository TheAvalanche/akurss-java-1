package lv.akurss.lesson5.lecture.practice;

public class Main {

	public static void main(String[] args) {
		
		Button clickMe = new Button("Click me!");
		clickMe.setActionListener(new PrintOnClickActionListener());
		clickMe.setOnHoverListener(new PrintOnClickActionListener());
		
		
		Button clickMe2 = new Button("Click me2!");
		clickMe2.setActionListener(new PrintOnClickActionListener());
		
		//put somewhere on the screen
		
		//following code executed on mouse click
		clickMe.press();
		clickMe.onHover();
		
		clickMe2.press();
	}
	
}
