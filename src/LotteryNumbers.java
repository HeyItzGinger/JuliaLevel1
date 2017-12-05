import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {
	Random rand = new Random();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
public static void main(String[] args) {
LotteryNumbers ln = new LotteryNumbers();
}
public LotteryNumbers() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 100);
	frame.setVisible(true);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	frame.add(p1, BorderLayout.NORTH);
	frame.add(p2, BorderLayout.CENTER);
	JButton button = new JButton("Click to get lottery number..");
	button.setBackground(new Color (0x00FFCC));
	button.setOpaque(true);
	p1.add(button);
	p2.add(label);
	label.setForeground(new Color (0xFF4488));
	button.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("You clicked me!");
	Integer r = rand.nextInt(10000000);
	String rstring = r.toString();
	label.setText(rstring);
	frame.pack();
}
}
