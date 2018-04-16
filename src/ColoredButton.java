import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;

public class ColoredButton {
	private Random r = new Random();
	private Color c;
	private String col;
 private Color getRandomColor() {
	int ran = r.nextInt(3);
	if(ran == 0) {
		col = "yellow";
		return Color.YELLOW;
	}
	else if (ran == 1) {
		col = "green";
		return Color.GREEN;
	}
	else {
		col = "pink";
		return Color.PINK;		
	}
}
 public JButton getNewButton() {
	 JButton b = new JButton();
	 Color c = getRandomColor();
	 b.setOpaque(true);
	 b.setBackground(c);
	 b.setPreferredSize(new Dimension(100,100));
	 return b;
 }
 public String getButtonColor() {
	 return col;
 }
}
