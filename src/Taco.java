
public class Taco {
	private String meat;
	private String cheese;
	private boolean guac;
	private static int counter;
	public Taco(String meat, String cheese, boolean guac) {
		this.meat = meat;
		this.cheese = cheese;
		this.guac = guac;
		counter ++;
	}
		public String getMeat() {
		return meat;
	}
	public static int getCounter() {
		return counter;
	}
	public String getCheese() {
		return cheese;
	}
	public boolean getGuac() {
		return guac;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setGuac(boolean guac) {
		this.guac = guac; 
	}
	
	
	
	


}
