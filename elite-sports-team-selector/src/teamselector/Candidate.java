package teamselector;

public class Candidate {
	private long jmbg;
	private String name;
	private String surname;
	private int birthYear;
	private String sportClub;
	private String awards;
	private int height;
	private int weight;
	private String healthIssue;
	private int activeYears;
	private String position;
	private double points;
	private double assistance;
	private String contract;
	private String scholarship;
	
	public Candidate(long jmbg, String name, String surname, int birthYear, String sportClub, String awards, int height, int weight, String healthIssue, int activeYears, String position, double points, double assistance, String contract, String scholarship) {
		this.jmbg =jmbg;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.sportClub = sportClub;
		this.awards = awards;
		this.height = height;
		this.weight = weight; 
		this.healthIssue = healthIssue;
		this.activeYears = activeYears;
		this.position = position;
		this.points = points;
		this.assistance = assistance;
		this.contract = contract;
		this.scholarship = scholarship;
		
	}
	public long getJmbg() {
		return jmbg;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public String getSportClub() {
		return sportClub;
	}
	
	public String getAwards() {
		return awards;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getHealthIssue() {
		return healthIssue;
	}

	public int getActiveYears() {
		return activeYears;
	}
	public String getPosition() {
		return position;
	}

	public double getPoints() {
		return points;
	}

	public double getAssistance() {
		return assistance;
	}

	public String getContract() {
		return contract;
	}

	public String getScholarship() {
		return scholarship;
	}
}
