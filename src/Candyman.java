import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Candyman implements ActionListener {
	public static void main(String[] args) {
		Candyman candy = new Candyman();
	}
	// To summon the Candyman, say his name 5 times in the mirror. You can watch the
	// movie trailer if you like.

	// Create a user interface that has a single button labeled “Candyman”.

	// When the user presses it 5 times, show them a scary picture from the internet
	// using the method below.
	int counter = 0;
 public Candyman() {
	 JFrame f = new JFrame();
	 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	 f.setVisible(true);
	 JButton b = new JButton("Candyman..");
	 f.add(b);
	 b.addActionListener(this);
	 f.pack();
 }
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	// And also play a SCARY or CREEPY sound.

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File("/Users/Guest/Google Drive/league-sounds/creepy-noise.wav");
		else if (whichSound == SCREAM)
			soundFile = new File("/Users/League/Google Drive/league-sounds/scream.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		counter ++;
		if(counter == 5) {
			showPictureFromTheInternet("http://anubis4_2000.tripod.com/mummypages2/Ramesses%20II%20mummy2.jpg");
			counter = 0;
		}
		System.out.println(counter);
	}
}
