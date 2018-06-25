
public class CatRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat kitty = new Cat("Fluffy");
		// 1. Ma  ke the Cat meow
		kitty.meow();
		// 2. Get the Cat to print it's name
		kitty.printName();
		// 3. Kill the Cat!
		for(int i = 0; i <= 9; i++) {
		kitty.kill();
		}
		
		Cat kitty2 = new Cat("Whickers");
		kitty2.printName();
	}
}
