package lv.akurss.lesson3.lecture._4_interface.interface_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintOnClickActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
}
