import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class codingExercise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();

	public static void main(String[] args) {
		codingExercise ce = new codingExercise();
	}

	public codingExercise() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		b1.setOpaque(true);
		b1.setBackground(Color.YELLOW);
		b2.setOpaque(true);
		b2.setBackground(Color.RED);
		b3.setOpaque(true);
		b3.setBackground(Color.BLUE);
		b4.setOpaque(true);
		b4.setBackground(Color.GREEN);
		frame.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			speak("Yellow");
		} else if (e.getSource() == b2) {
			speak("Red");
		} else if (e.getSource() == b3) {
			speak("Blue");
		} else {
			speak("Green");
		}
	}
}
