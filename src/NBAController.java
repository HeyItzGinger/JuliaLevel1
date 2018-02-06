import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class NBAController {
public static void main(String[] args) {
	NBAScoreboard nbaScore = new NBAScoreboard();
	NBAController npsControl = new NBAController();
}
public NBAController() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setLayout(new BorderLayout());
	
	//Home Setup
	JPanel home = new JPanel();
	home.setLayout(new BorderLayout());
	frame.add(home, BorderLayout.WEST);
	
	JPanel home1 = new JPanel();
	home.add(home1, BorderLayout.NORTH);
	JLabel Hlabel = new JLabel("Home");
	home1.add(Hlabel);
	JPanel home2 = new JPanel();
	home.add(home2, BorderLayout.CENTER);
	JLabel HscoreLabel = new JLabel("Score: ");
	home2.add(HscoreLabel);
	JButton Hplus = new JButton("+1");
	home2.add(Hplus);
	JButton Hminus = new JButton("-1");
	home2.add(Hminus);
	JPanel home3 = new JPanel();
	home.add(home3, BorderLayout.SOUTH);
	JLabel TOlabel = new JLabel("Timeouts: ");
	home3.add(TOlabel);
	JButton TOminus = new JButton("-1");
	home3.add(TOminus);
	frame.pack();
	//Away Setup
	
}
}
