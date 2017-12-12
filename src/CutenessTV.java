import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. 
	//Use the methods below to play the cutest videos ever.
public static void main(String[] args) {
	CutenessTV CTV = new CutenessTV();
}
public CutenessTV() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	JButton b1 = new JButton("Duck");
	panel.add(b1);
	JButton b2 = new JButton("Frog");
	panel.add(b2);
	JButton b3 = new JButton("UNICORN!!");
	panel.add(b3);
	frame.pack();
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	
}
	
	void showDucks() {
			playVideo("Drirjl5K9Yk");
		}

		void showFrog() {
			playVideo("aSjCb-FfxhI");
		}
		
		void showFluffyUnicorns() {
			playVideo("qRC4Vk6kisY");
		}

		void playVideo(String videoID) {
			try {
		URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
	if(b.getText().equals("Duck")) {
		showDucks();
	}
	else if(b.getText().equals("Frog")) {
		showFrog();
	}
	else {
		showFluffyUnicorns();
	}
		}


}
