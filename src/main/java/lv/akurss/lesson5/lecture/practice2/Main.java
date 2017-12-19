package lv.akurss.lesson5.lecture.practice2;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ButtonDemo");
		
		JPanel screen = new JPanel();
		
		JButton b1 = new JButton("Click me!");
		b1.addActionListener(new PrintOnClickActionListener());
		
		screen.add(b1);
		
		frame.setContentPane(screen);
		frame.pack();
		frame.setVisible(true);
	}
}
