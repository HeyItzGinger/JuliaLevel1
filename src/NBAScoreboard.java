import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NBAScoreboard {
	JFrame frame = new JFrame();
	
	JPanel home = new JPanel();
	JPanel HomelabelPanel = new JPanel();
	int HscoreValue = 0;
	int AscoreValue = 0;
	int HtimeoutValue = 2;
	int AtimeoutValue = 2;
	JPanel homeScore = new JPanel();
	JPanel homeTOScore = new JPanel();
	JLabel home1 = new JLabel("Home");
	JButton home2 = new JButton("Score: " + HscoreValue);
	JButton home3 = new JButton("Timeouts: " + HtimeoutValue);
	
	JPanel away = new JPanel();
	JPanel AwaylabelPanel = new JPanel();
	JLabel away1 = new JLabel("Away");
	JPanel awayScore = new JPanel();
	JButton away2 = new JButton("Score: " + AscoreValue);
	JPanel awayTOScore = new JPanel();
	JButton away3 = new JButton("Timeouts: " + AtimeoutValue);
	

	public NBAScoreboard() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		home.setLayout(new BorderLayout());
		away.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.add(home, BorderLayout.WEST);
		frame.add(away, BorderLayout.EAST);
		
		home.add(HomelabelPanel, BorderLayout.NORTH);
		home.add(homeScore, BorderLayout.CENTER);
		home.add(homeTOScore, BorderLayout.SOUTH);
		HomelabelPanel.add(home1);
		homeScore.add(home2);
		homeTOScore.add(home3);
		away.add(AwaylabelPanel, BorderLayout.NORTH);
		away.add(awayScore, BorderLayout.CENTER);
		away.add(awayTOScore, BorderLayout.SOUTH);
		AwaylabelPanel.add(away1);
		awayScore.add(away2);
		awayTOScore.add(away3);
		homeScore.setOpaque(true);
		homeScore.setBackground(new Color(235, 90, 254));
		awayScore.setOpaque(true);
		awayScore.setBackground(new Color(133, 98, 245));
		frame.pack();
		
	}
}
