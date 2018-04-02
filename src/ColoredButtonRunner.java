import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColoredButtonRunner implements ActionListener {
	JFrame frame = new JFrame();
	public static void main(String[] args) {
		new ColoredButtonRunner();
	}
	public ColoredButtonRunner() {
		drawButtons();
	}
	public void drawButtons() {
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		ColoredButton CB = new ColoredButton();
		JButton b1 = CB.getNewButton();
		JButton b2 = CB.getNewButton();
		JButton b3 = CB.getNewButton();
		JButton b4 = CB.getNewButton();
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton redraw = new JButton("Redraw");
		panel.add(redraw);
		redraw.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		drawButtons();
	}
}
