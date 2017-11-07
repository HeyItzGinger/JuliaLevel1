
public class Athlete {
	private String sport;
	private String position;
	private int jerseynumber;
	private static int athleteJersey = 11;
	public Athlete(String sport, String position) {
		this.sport = sport;
		this.position = position;
		this.jerseynumber = athleteJersey;
		athleteJersey ++;
	}

	public static void main(String[] args) {
		Athlete julia = new Athlete("Volleyball", "Setter");
		Athlete butter = new Athlete("Soccer", "Goalie");
		Athlete alex = new Athlete("Lyrical Dancer", "The Splits");
		System.out.println(julia.getSport() + " " + julia.getPosition());
		julia.setPosition("Middle block");
		System.out.println(julia.getSport() + " " + julia.getPosition());
		System.out.println(julia.getSport() + " " + julia.getPosition() + " " + julia.getJerseynumber());
	}
	public int getJerseynumber() {
		return jerseynumber;
	}
	public String getSport(){
		return sport; 
	}
	public String getPosition() {
		return position;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
