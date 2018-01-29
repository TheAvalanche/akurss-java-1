package lv.akurss.lesson3.lecture._4_interface.interface_use_case;

public class DefaultActionListener implements ActionListener {
	@Override
	public void actionPerformed(String name) {
		System.out.println(name + " button pressed");
	}
}
