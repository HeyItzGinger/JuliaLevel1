

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
			Turtle timothy = new Turtle();
	// 5. Add the turtle to the panel 
			payton.addTurtle(timothy);
			// 6. Put 50 Turtles on the beach
			for(int i = 0; i < 50; i++) {
				
			}
			francine.pack();
		}
	}



