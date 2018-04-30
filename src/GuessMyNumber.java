import java.util.Random;

public class GuessMyNumber {
	Random ran = new Random();
	int r;
public GuessMyNumber () {
	r =	ran.nextInt(99);
	r += 1000;
}
public boolean CheckNumber (int r1) {
	if (r == r1) {
		return true;
	}
	else {
		return false;
	}
}
}
