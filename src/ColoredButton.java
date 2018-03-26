import java.awt.Color;
import java.util.Random;

public class ColoredButton {
	Random r = new Random();
public ColoredButton () {
	
}
 private Color getRandomColor() {
	int ran = r.nextInt(3);
	if(ran == 0) {
		return Color.YELLOW;
	}
}
}
