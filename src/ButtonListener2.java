import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener2 implements ActionListener {
	
	JButton b = new JButton();
	public static void main(String[] args) {
		new ButtonListener2();
	}

	public ButtonListener2(){
		JFrame f = new JFrame();
		f.setVisible(true);
		JButton b = new JButton("Hi there!");
		f.add(b);
		f.pack();
			b.addActionListener(this);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("How are you?");
	}
}
