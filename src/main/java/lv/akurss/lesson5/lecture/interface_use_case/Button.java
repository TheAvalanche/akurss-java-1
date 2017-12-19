package lv.akurss.lesson5.lecture.interface_use_case;

public class Button {
	
	private String name;
	private ActionListener actionListener;

	public Button(String name) {
		this.name = name;
	}

	public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
	}
	
	public void press() {
		actionListener.actionPerformed(name);
	}
}
