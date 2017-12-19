package lv.akurss.lesson5.lecture.practice2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintOnClickActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
}
