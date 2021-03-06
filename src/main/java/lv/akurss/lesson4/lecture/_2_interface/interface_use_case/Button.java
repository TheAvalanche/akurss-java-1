package lv.akurss.lesson4.lecture._2_interface.interface_use_case;

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
