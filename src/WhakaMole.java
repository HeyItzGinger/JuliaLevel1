import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhakaMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
public static void main(String[] args) {
	WhakaMole WM = new WhakaMole();
	
	
}
public WhakaMole() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(new Dimension(200, 300));
	panel.setBackground(new Color (0xEEFFBB));
}

}
