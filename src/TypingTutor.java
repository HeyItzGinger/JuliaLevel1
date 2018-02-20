import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	char currentLetter =  generateRandomLetter();
	JLabel label = new JLabel();
	public static void main(String[] args) {
	
}
public TypingTutor () {
	frame.setVisible(true);
	frame.add(label);
	label.setText(String.valueOf(currentLetter));
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(label.CENTER);
	frame.addKeyListener(this);
	}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
