package elitesportsteamselector;

public class Candidate {
	
	private long iDNumber;
	private String name;
	private String surname;
	private int birthYear;
	private int height;
	private int weight;
	private int acctiveYears;
	private String position;
	private double points;
	private double assistance;
	
	public Candidate (long iDNumber, String name, String surname, int birthYear, int height, int weight, int acctiveYears, String position, double points, double assistance) {
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;
		this.acctiveYears = acctiveYears;
		this.position = position;
		this.points = points;
		this.assistance = assistance;
		
	}
		public long getIdNumber() {
			return iDNumber;
		}

		public String getName() {
			return name;
		}
		
		public String getSurname() {
			return surname;
		}
		
		public int getbirthYear() {
			return birthYear;
		}
		
		public int getHeight() {
			return height;
		}
		
		public int getWeight() {
			return weight;
		}
		
		public int getacctiveYears() {
			return acctiveYears;
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
	}
