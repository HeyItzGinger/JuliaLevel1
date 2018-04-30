import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuessMyNumberRunner implements ActionListener {
	JButton b1;
	JButton b2;
	JFrame f;

	public static void main(String[] args) {
		GuessMyNumberRunner GMNR = new GuessMyNumberRunner();
	}

	public GuessMyNumberRunner() {
		b1 = new JButton("Guess Number");
		b2 = new JButton("Number goes here");
		b1.addActionListener(this);
		f = new JFrame();
		f.setVisible(true);
		JPanel p = new JPanel();
		f.add(p);
		p.add(b1);
		p.add(b2);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		GuessMyNumber GMN2 = new GuessMyNumber();
		for (int i = 1000; i < 1099; i++) {
			boolean boo = GMN2.CheckNumber(i);
			if (boo) {
				b2.setText(" The number is.... " + i);
				f.pack();
			}
		}

	}
}
