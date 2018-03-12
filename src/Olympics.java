
public class Olympics {
	public static void main(String[] args) {
		oAthlete a1 = new oAthlete("Julia", "Canada", "Volleyball");
		oAthlete a2 = new oAthlete("Alex", "USA", "Basketball");
		oAthlete a3 = new oAthlete("Olivia", "Coasterica", "Bobsleding");

		a1.setGold();
		a1.setSilver();

		a2.setSilver();
		a2.setSilver();

		a3.setBronze();
		a3.setSilver();

		System.out.println(a1.getName() + " is from " + a1.getCountry() + " and plays " + a1.getSport()
				+ ". She has won " + a1.getGold() + " gold and " + a1.getSilver() + "silver.");
		System.out.println(a2.getName() + " is from " + a2.getCountry() + " and plays " + a2.getSport() + ". He has won "
				+ a2.getSilver() + " silver and " + a2.getGold() + " gold. ");
		
	}
}
