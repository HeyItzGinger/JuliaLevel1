import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;

public class ColoredButton {
	Random r = new Random();
	Color c;
 private Color getRandomColor() {
	int ran = r.nextInt(3);
	if(ran == 0) {
		return Color.YELLOW;
	}
	else if (ran == 1) {
		return Color.GREEN;
	}
	else {
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
}
