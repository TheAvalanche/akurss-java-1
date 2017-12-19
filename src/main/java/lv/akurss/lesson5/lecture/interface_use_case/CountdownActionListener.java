package lv.akurss.lesson5.lecture.interface_use_case;

public class CountdownActionListener implements ActionListener {
	@Override
	public void actionPerformed(String name) {
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
		}
	}
}
