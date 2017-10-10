import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
		cookie.makeButton();
	}
	public void makeButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Woohoo");
		Random rand = new Random();
		int nem = rand.nextInt(4);
		if(nem == 0) {
			System.out.println("There is someone you know thinking of you..");
		}
		else if( nem == 1) {
			System.out.println("Good fortune is on you side.");
		}
		else if ( nem == 2){
			System.out.println("You will get what you've always wanted in the future..");
		}
		else {
			System.out.println("You will get an award in the future.");
		}
	}
	
}
	//Fortune Cookie recipe: Create a button that gives one of five random fortunes when clicked.

	//Make a class, main method and showButton method. Put a printout in the showButton method. Instantiate your class and see that your printout works. 

	//Make a JFrame in showButton method and get it to show.

	//Make a JButton and add it to the JFrame.

	//Add an action listener to the button (auto fix the errors!!). When the button is clicked, say “Woohoo”.

	//Generate a random number between 0 and 4. Depending on the random number, show on of five fortunes.



