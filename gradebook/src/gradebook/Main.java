package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("STUDENT CLASS");
		System.out.println("Teacher name: Mrs James");
		
		String student1; 
		String student2;
		String student3;
		String student4;
		String student5;
				
				
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		int grade5;
		int totalGrade;
		
		try(Scanner sc = new Scanner(System.in)) {
		
			System.out.println("Enter Grade, Students Name and Surname");
			grade1 = sc.nextInt();
			student1 = sc.next();
		
			System.out.println("Enter Grade, Students Name and Surname");
			grade2 = sc.nextInt();
			student2 = sc.next();
		
			System.out.println("Enter Grade, Students Name and Surname");
			grade3 = sc.nextInt();
			student3 = sc.next();
		
			System.out.println("Enter Grade, Students Name and Surname");
			grade4 = sc.nextInt();
			student4 = sc.next();
		
			System.out.println("Enter Grade, Students Name and Surname");
			grade5 = sc.nextInt();
			student5 = sc.next();
		
			totalGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5 ;
			System.out.println("Prosek je :" + totalGrade);
		}
	}
}
