import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhakaMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	static int counter = 0;
	static Date TimeAtStart = new Date();

	public static void main(String[] args) {
		new WhakaMole();

	}

	public WhakaMole() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(new Dimension(300, 300));
		panel.setBackground(new Color(0xEEFFBB));
		int r = rand.nextInt(24);
		drawButtons(r);
	}

	void drawButtons(int r) {
		for (int i = 0; i < 24; i++) {
			JButton moles = new JButton();
			panel.add(moles);
			if (i == r) {
				moles.setText("Mole!");
  
			}
			
			moles.addActionListener(this);
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton j = (JButton) e.getSource();
		if (j.getText().equals("Mole!")) {
			counter ++;
			if (counter == 10) {
				endGame(TimeAtStart, 10);
				System.exit(0);
			}
			frame.dispose();
			new WhakaMole();
		}
		else {
			speak("incorrect.");
		}


	}

}
