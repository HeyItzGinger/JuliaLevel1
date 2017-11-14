import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	// Make a ChuckleClicker class, a main method and a makeButtons method. Put a
	// pop-up in the makeButtons method and get it working. You will need to
	// instantiate your class and call method an instance of it.
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
	}

	// Make a JFrame in makeButtons() method and get it to show.
	JButton button = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	JLabel label = new JLabel();
	
	public ChuckleClicker() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.NORTH);
		JPanel panel2 = new JPanel();
		frame.add(panel2, BorderLayout.SOUTH);

		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		
		panel2.add(label);
		frame.setSize(500, 200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if(e.getSource() == button) {
	label.setText("What kind of bagel can I fly?!");
}
else {
	label.setText("A PLAIN bagel!! :P");
}
	}

	// Add a JPanel and two JButtons and get them to show up like this:

	// *[Optional] Customize your GUI with setText, setSize, etc.

	// Make a pop-up that says “hi” when either of the buttons are pressed. You will
	// need to add listeners to the buttons for this to work.

	// Check if the ActionEvent came from the joke button or the punchline button.
	/// (arg0.getSource() == jokeButton)

	// Use JOptionPane to print the joke or the punchline depending on which button
	// was clicked.

}
