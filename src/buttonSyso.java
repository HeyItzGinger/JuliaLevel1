import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class buttonSyso implements ActionListener {
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
 JButton button1 = new JButton("Button one");
JButton button2 = new JButton("Button two");
public static void main(String[] args) {
	buttonSyso bs = new buttonSyso();	
}
public buttonSyso() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button1) {
		System.out.println("Button one was pressed!");
	}
	else {
		System.out.println("Button two was pressed!");
	}
}
}
