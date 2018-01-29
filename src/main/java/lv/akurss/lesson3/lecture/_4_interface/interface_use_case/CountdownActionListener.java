package lv.akurss.lesson3.lecture._4_interface.interface_use_case;

public class CountdownActionListener implements ActionListener {
	@Override
	public void actionPerformed(String name) {
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
		}
	}
}
