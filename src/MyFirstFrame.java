import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstFrame {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setVisible(true);
	
	JPanel p = new JPanel();
	f.add(p);
	
	JButton b = new JButton("Hi, there! :D");
	p.add(b);
	JButton button = new JButton("How's it goin'?");
	p.add(button);
	f.pack();
	
}
}
