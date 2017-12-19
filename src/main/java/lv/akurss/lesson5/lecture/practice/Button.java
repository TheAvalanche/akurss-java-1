package lv.akurss.lesson5.lecture.practice;

public class Button {
	
	private String text;
	private ActionListener actionListener;
	private OnHoverListener onHoverListener;

	public Button(String text) {
		this.text = text;
	}

	public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
	}

	public void setOnHoverListener(OnHoverListener onHoverListener) {
		this.onHoverListener = onHoverListener;
	}

	public void press() {
		actionListener.actionPerformed(text);
	}
	
	public void onHover() {
		onHoverListener.hoverPerformed(text);
	}
}
