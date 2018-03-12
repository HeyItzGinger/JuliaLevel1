
public class oAthlete {
	private String name;
	private String country;
	private String sport;
	private int gold;
	private int silver;
	private int bronze;

	public oAthlete(String name, String country, String sport) {
		this.name = name;
		this.country = country;
		this.sport = sport;
	}

	public void setGold() {
		gold++;
	}

	public void setSilver() {
		silver++;
	}

	public void setBronze() {
		bronze++;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getSport() {
		return sport;
	}
	public int getGold() {
		return gold;
	}
	public int getSilver() {
		return silver;
	}

	public int getBronze() {
		return bronze;
	}
	

}
