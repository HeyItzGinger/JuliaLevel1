 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String photo = ("http://brainpages.org/wp-content/uploads/2012/08/Frog-and-Horse.jpg");
		// 2. create a variable of type "Component" that will hold your image
		Component c;
		// 3. use the "createImage()" method below to initialize your Component
		c = createImage(photo);
		// 4. add the image to the quiz window
		quizWindow.add(c);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What Do you see?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equals("frog")) {
			JOptionPane.showMessageDialog(null, "That's right!! But there is another animal in this picture. Look again.");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Also Right but there's ANOTHER animal!! What else do you see?");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
		String photo2 = "http://cdn.attackofthecute.com/January-04-2013-19-53-34-fd.jpg";
		//String photo2  = "http://www.awesomelycute.com/gallery/2014/03/cute-puppies-awesomelycute-com-3253.jpg";
		c = createImage(photo2);
		// 11. add the second image to the quiz window
		quizWindow.add(c);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String cute = JOptionPane.showInputDialog("Is this dog cute??");
		// 14+ check answer, say if correct or incorrect, etc.
		if(cute.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Corrrrrect!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Innnncorrect!!!!!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





