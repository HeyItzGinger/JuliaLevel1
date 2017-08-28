
public class Cinderella {
	String myName;
	public Cinderella(String name) {
		myName = name;
		System.out.println(myName + " is here!");
}
	void talktomice(String speak) {
		System.out.println(myName + " says " + speak);
	}
	void dance(int numSteps) {
		System.out.println(myName + " is dancing " + numSteps + " steps.");
	}
	void smile() {
		System.out.println(myName + " is smiling!");
	}
}
