import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	public static void main(String[] args) {
		GetLatestTweet GLT = new GetLatestTweet();
	}
	JTextField tf = new JTextField(15);
	JTextPane tp = new JTextPane();
	// 1. Make a UI with a button and a text field for a search term.
	public GetLatestTweet() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel1 = new JPanel();
		frame.add(panel1, BorderLayout.NORTH);
		JPanel panel2 = new JPanel();
		frame.add(panel2, BorderLayout.CENTER);
		panel1.add(tf);
		panel1.setBackground(new Color(0xFFFF99));
		tp.setBackground(new Color(0xFFFF99));
		tp.setEditable(false);
		JButton button = new JButton("Get Tweet!");
		panel1.add(tf);
		tp.setPreferredSize(new Dimension(500, 500));
		panel1.add(button);
		button.addActionListener(this);
		JScrollPane scroll = new JScrollPane(tp);
		panel2.add(scroll);
		frame.pack();
		
	}

	// 2. When the button is clicked, print “tweet tweet”.

	// 3. Add these 2 jars to your project’s build path;
	// Apache Commons Logging: commons-logging-1.1.3.jar
	// Twitter4J: twitter4j-core-3.0.5
	// You will find them at /Users/League/Google Drive/league-jars/

	// 4. Use this method to get the latest tweet when the user clicks the button:
	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			String l = "";
			for(int i = 0; i < result.getCount(); i++) {
			l += result.getTweets().get(i).getText() + "\n";
			}
			return l;
		}
		 catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("tweet tweet!");
		String s = getLatestTweet(tf.getText());
		System.out.println(s);
		tp.setText(s);
	}

}
