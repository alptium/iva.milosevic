package elitesportsteamselector;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		candidateChoice();
	}
		
		private static void candidateChoice() {
		
		System.out.println("Welcome to voleyball female sport team selection!");
		System.out.println();
		System.out.println("Questionnaire for athlete's candidates");
		System.out.println();
		System.out.println("Please fill out the empty blank fields");
		System.out.println();
		
		sportClub String;
		awards String;
		contract String;
		scholarship String;
		
		try(Scanner sc = new Scanner(System.in)) { 
		
			System.out.println("Enter your name");
			String name = sc.next();
			
			System.out.println("Enter your surname");
			String surname = sc.next();
			
			System.out.println("Enter your birth year");
		    int birthYear = sc.nextInt();
			
			System.out.println("Enter your identification number");
		   	long iDNumber = sc.nextLong();
			
			System.out.println("Enter your previous sport club");
			String sportClub = sc.next();
			
			System.out.println("Enter your previous awards");
			String awards = sc.next();
			
			System.out.println("Do you have a professional contract with another club?");
			String contract = sc.next();
			
			System.out.println("Do you have a sports scholarship contract?");
			String scholarship = sc.next();
			
			System.out.println("Enter your Acctive Years");
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
			
			Candidate = new Candidate(long iDNumber, String name, String surname, int birthYear, int height, int weight, int acctiveYears, String position, double points, double assistance) {
			
			
	fo (birthYear>= 2005 && height > 170 &&  weight > 55 && points > 60 && assistance > 30 && acctiveYears > 3) {
				System.out.println("Thank you" + getName() + getSurname());
				System.out.println("Birth Year: " + getbirthYear());
				System.out.println("Your answers are : " );
				System.out.println("Height: " + getHeight());
				System.out.println("Weight: " + getWeight());
				System.out.println("Acctive Years: " + getacctiveYears());
				System.out.println("Position: " + getPosition());
				System.out.println("Points: " + getPoints());
				System.out.println("Assistances: " + getAssistance());
				System.out.println();
				System.out.println("Candidate fulfills the criteria");
			}
			
				System.out.println("Candidate does not fulfills the criteria"); 	
			}
		}
	}
}
	
		



