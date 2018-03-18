package teamselector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to voleyball female sport team selection!");
		System.out.println();
		System.out.println("Questionnaire for athlete's candidates");
		System.out.println();
		System.out.println("Please fill out the empty blank fields");
		System.out.println();
		
		runCandidate();
	}
	public static void runCandidate() {
		
		try(Scanner sc = new Scanner(System.in)) { 
			
			System.out.println("Enter your JMBG");
			long jmbg = sc.nextLong();
		
			System.out.println("Enter your name");
			String name = sc.next();
			
			System.out.println("Enter your surname");
			String surname = sc.next();
			
			System.out.println("Enter your birth year");
		    int birthYear = sc.nextInt();
			
			System.out.println("Enter your previous sport club");
			String sportClub = sc.next();
			
			System.out.println("Enter your previous awards");
			String awards = sc.next();
			
			System.out.println("Do you have Health Issues? (Y/N) ");
			String healthIssue = sc.next().substring(0 , 1);
			if (healthIssue.equalsIgnoreCase("y")) {
				System.out.println("You can not participate in competition.");
				return;
			}
			
			System.out.println("Do you have a professional contract with another club? (Y/N) ");
			String contract = sc.next().substring(0 , 1);
			if (contract.equalsIgnoreCase("y")) {
				System.out.println("You can not participate in competition.");
				return;
			}
			
			System.out.println("Do you have a sports scholarship contract? (Y/N) ");
			String scholarship = sc.next().substring(0 , 1);
			if (scholarship.equalsIgnoreCase("y")) {
				System.out.println("You can not participate in competition.");
				return;
			}
			
			System.out.println("Enter your Active Years");
			int activeYears = sc.nextInt();
			
			System.out.println("Enter your Position");
			String position = sc.next();
			
			System.out.println("Enter your Height");
			int height = sc.nextInt();
			
			System.out.println("Enter your Weight");
		    int weight = sc.nextInt();
			
			System.out.println("Enter your Points");
			double points = sc.nextDouble();
			
			System.out.println("Enter your Assistance");
			double assistance = sc.nextDouble();
			
			Candidate candidate = new Candidate (jmbg, name, surname, birthYear, sportClub, awards, height, weight, healthIssue, activeYears, position, points, assistance, contract, scholarship);
			System.out.println("These are your answers: ");
			System.out.println("Name: " + candidate.getName());
			System.out.println("Surname: " + candidate.getSurname());
			System.out.println("Birth Year: " + candidate.getBirthYear());
			System.out.println("Previous Sport Club: " + candidate.getSportClub());
			System.out.println("Awards: " + candidate.getAwards());
			System.out.println("Contracts: " + candidate.getContract());
			System.out.println("Health Issues: " + candidate.getHealthIssue());
			System.out.println("Scholarships: " + candidate.getScholarship());
			System.out.println("Active Years : " + candidate.getActiveYears());
			System.out.println("Position: " + candidate.getPosition());
			System.out.println("Your Height: " + candidate.getHeight());
			System.out.println("Weight: " + candidate.getWeight());
			System.out.println("Points: " + candidate.getPoints());
			System.out.println("Assistences: " + candidate.getAssistance());
			
			if (birthYear > 14 && activeYears >= 3 && height >= 170 && weight >= 50 && points >= 30 && assistance >= 20 ) {
				System.out.println("Congratulations, you have passed the conditions of selection!");
			} else {
				System.out.println("Unfortunately, you are not pass the conditions of selection.");
				System.out.println();
				System.out.println("Do you want to add new candidate?  Yes/ No");
				String enter = sc.next().substring(0, 1);
				if (enter.equalsIgnoreCase("y")) {
					runCandidate();
				} else if (enter.equalsIgnoreCase("n")) {
					return;
				}
			
			}
		}
	}
}

