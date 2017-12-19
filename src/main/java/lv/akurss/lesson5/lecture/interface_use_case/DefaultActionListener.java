package lv.akurss.lesson5.lecture.interface_use_case;

public class DefaultActionListener implements ActionListener {
	@Override
	public void actionPerformed(String name) {
		System.out.println(name + " button pressed");
	}
}
