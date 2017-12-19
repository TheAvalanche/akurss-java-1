package lv.akurss.lesson5.lecture.practice;

public class PrintOnClickActionListener implements ActionListener, OnHoverListener {
	
	@Override
	public void actionPerformed(String text) {
		System.out.println(text + " clicked");
	}

	@Override
	public void hoverPerformed(String text) {
		System.out.println(text + " on hover");
	}
}
