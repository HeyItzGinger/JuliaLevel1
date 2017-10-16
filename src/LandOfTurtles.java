

	import java.util.Random;

import javax.swing.JFrame;
	import org.teachingextensions.logo.MultiTurtlePanel;
	import org.teachingextensions.logo.Turtle;

	public class LandOfTurtles {
		public static void main(String[] args) {
			MultiTurtlePanel payton = new MultiTurtlePanel();
			String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

	// 1. Create a frame & make it visible
			JFrame francine = new JFrame();
			francine.setVisible(true);
			// 2. Add the panel to the frame
			francine.add(payton);
			// 3. Set the background image of the panel to the Galapagos Islands 
			payton.setBackgroundImage(galapagosIslands);
			// 4. Instantiate a Turtle 
		francine.pack();
	// 5. Add the turtle to the panel 
			
			// 6. Put 50 Turtles on the beach
			Random r = new Random();
			for(int i = 0; i < 200; i++) {
				Turtle timothy = new Turtle();
				timothy.setX(r.nextInt(800));
				timothy.setY(r.nextInt(500));
				payton.addTurtle(timothy);
			}
		}
	}



