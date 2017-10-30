
public class TacoRunner {
	public static void main(String[] args) {
		Taco timmy = new Taco("chicken", "blue", false);
		Taco tommy = new Taco("pork", "mexican", true);
		System.out.println(timmy.getCheese() + " " + timmy.getMeat() + " " + timmy.getGuac());
		System.out.println(tommy.getCheese() + " " + tommy.getMeat() + " " + tommy.getGuac());
		timmy.setCheese("cheddar");
		timmy.setGuac(true);
		timmy.setMeat("bacon");
		System.out.println(timmy.getCheese() + " " + timmy.getGuac() + " " + timmy.getMeat());
		tommy.setCheese("mexican");
		tommy.setGuac(false);
		tommy.setMeat("beef");
		System.out.println(tommy.getCheese() + " " + tommy.getMeat() + " " + tommy.getGuac());
		System.out.println("I made " + Taco.getCounter() + " tacos today!");
	}

}
