import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class NBAController implements ActionListener {
	static NBAScoreboard nbaScore;
	JButton Hplus = new JButton("+1");
	JButton Hminus = new JButton("-1");
	JButton HTOminus = new JButton("-1");
public static void main(String[] args) {
	nbaScore = new NBAScoreboard();
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
	home2.add(Hplus);
	home2.add(Hminus);
	JPanel home3 = new JPanel();
	home.add(home3, BorderLayout.SOUTH);
	JLabel HTOlabel = new JLabel("Timeouts: ");
	home3.add(HTOlabel);
	home3.add(HTOminus);
	
	Hplus.addActionListener(this);
	Hminus.addActionListener(this);
	HTOminus.addActionListener(this);
	//Away Setup
	JPanel away = new JPanel();
	away.setLayout(new BorderLayout());
	frame.add(away, BorderLayout.EAST);
	
	JPanel away1 = new JPanel();
	away.add(away1, BorderLayout.NORTH);
	JLabel Alabel = new JLabel("Away");
	away1.add(Alabel);
	JPanel away2 = new JPanel();
	away.add(away2, BorderLayout.CENTER);
	JLabel AscoreLabel = new JLabel("Score: ");
	away2.add(AscoreLabel);
	JButton Aplus = new JButton("+1");
	away2.add(Aplus);
	JButton Aminus = new JButton("-1");
	away2.add(Aminus);
	JPanel away3 = new JPanel();
	away.add(away3, BorderLayout.SOUTH);
	JLabel ATOlabel = new JLabel("Timeouts: ");
	away3.add(ATOlabel);
	JButton ATOminus = new JButton("-1");
	away3.add(ATOminus);
	
	
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == Hplus) {
	nbaScore.setHScore(1);
}
	else if(e.getSource() == Hminus) {
		nbaScore.setHScore(-1);
	}
	else if(e.getSource() == HTOminus) {
		nbaScore.setHTO(-1);
	}
}
}
