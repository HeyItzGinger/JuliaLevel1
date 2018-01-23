import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
	JFrame frame = new JFrame();
	public SensitiveKeyboard(){
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	SensitiveKeyboard sk = new SensitiveKeyboard();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Ouch!!!!! That hurts..... your a bully.");
		
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
