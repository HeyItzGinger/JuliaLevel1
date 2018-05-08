import java.util.Random;

public class NoisyPet {
	static Random ran = new Random();
	static int r;
	static String animal;
public NoisyPet() {
	NoisyPet np = new NoisyPet();
	r = ran.nextInt(3);
	if (r == 0) {
		//frog
		animal = "croak";
	}
	else if (r == 1) {
		animal = "blubshhhhh";
		//octopus
	}
	else {
		//llama
		animal = "RRRrrrAhahahAHahh";
	}
}
	public String petTalk() {
		return animal;
	}
}
