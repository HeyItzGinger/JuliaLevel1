/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class SmurfsRunner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	System.out.println(Handy.getName());
	Handy.eat();
	
	Smurf Papa = new Smurf("Papa");
	System.out.println(Papa.getName());
	System.out.println(Papa.getName() + "and I'm wearing a " + Papa.getHatColor() + " hat ");
	System.out.println(Papa.getName() + "and I'm a " + Papa.isGirlOrBoy());
	
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getName() + "and I'm wearing a " + Smurfette.getHatColor() + " hat ");
	System.out.println(Smurfette.getName() + "and I'm a " + Smurfette.isGirlOrBoy());
	
	
}
}
