package elitesportoop;

public class Candidate {
	
	private long jmbg;
	private String name;
	private String surname;
	private int birthYear;
	private int height;
	private int weight;
	private String healthIssue;
	private int acctiveYears;
	private String position;
	private double points;
	private double assistance;
	private String contract;
	private String scholarship;
	
	public Candidate (long jmbg, String name, String surname, int birthYear, int height, int weight, String healthIssue, int acctiveYears, String position, double points, double assistance, String contract, String scholarship) {
		this.jmbg =jmbg;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight; 
		this.healthIssue = healthIssue;
		this.acctiveYears = acctiveYears;
		this.position = position;
		this.points = points;
		this.assistance = assistance;
		this.contract = contract;
		this.scholarship = scholarship;
		
	}
		public long getjmbg() {
			return jmbg;
		}
		
		public String getname() {
			return name;
		}
		
		public String getsurname() {
			return surname;
		}
		
		public int getbirthYear() {
			return birthYear;
		}
		
		public int getheight() {
			return height;
		}
		
		public int getweight() {
			return weight;
		}
		
		public String gethealthIssue() {
			return healthIssue;
		}
		
		public int getacctiveYears() {
			return acctiveYears;
		}
		public String getposition() {
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


