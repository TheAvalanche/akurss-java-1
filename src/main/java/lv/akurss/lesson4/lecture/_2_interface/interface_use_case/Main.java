package lv.akurss.lesson4.lecture._2_interface.interface_use_case;

public class Main {
	public static void main(String[] args) {
		Button button1 = new Button("Click me!");
		button1.setActionListener(new DefaultActionListener());
		
		Button button2 = new Button("Countdown");
		button2.setActionListener(new CountdownActionListener());
		
		button1.press();
		button2.press();
	}
}
