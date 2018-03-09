package elitesportsteamselector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to voleyball female sport team selection!");
		System.out.println();
		System.out.println("Questionnaire for athlete's candidates");
		System.out.println();
		System.out.println("Please fill out the empty blank fields");
		System.out.println();
		
		try(Scanner sc = new Scanner(System.in)) { 
		
			System.out.println("Enter your name");
			String name = sc.next();
			
			System.out.println("Enter your surname");
			String surname = sc.next();
			
			System.out.println("Enter your birth year");
			int birthYear = sc.nextInt();
			
			System.out.println("Enter your identification number");
			long iD = sc.nextLong();
			
			System.out.println("Enter your previous sport club");
			String previousClub = sc.next();
			
			System.out.println("Enter your previous awards");
			String previousAward = sc.next();
			
			System.out.println("Do you have a professional contract with another club?");
			boolean hasContract = sc.nextBoolean();
			
			System.out.println("Do you have a sports scholarship contract?");
			boolean hasScholarship = sc.nextBoolean();
			
			System.out.println("Enter your Active Years");
			int acctiveYears = sc.nextInt();
			
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
			
			if(birthYear >= 2005 && height > 170 &&  weight > 55) {
				System.out.println("Thank you" + name + surname);
				System.out.println("Your answers are" + acctiveYears + position + points + assistance);
				System.out.println("Candidate fulfills the criteria"); 
			}
			
			else if(hasContract && !hasScholarship ) {
				System.out.println("Candidate fulfills the criteria");
			}

			else if(points < 60 && assistance < 30 || acctiveYears < 3) {
				System.out.println("Candidate does not fulfills the criteria");
			}
		}
	}
}

