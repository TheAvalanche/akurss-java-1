package lv.akurss.lesson4.lecture._2_interface.interface_use_case;

public class CountdownActionListener implements ActionListener {
	@Override
	public void actionPerformed(String name) {
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
		}
	}
}
