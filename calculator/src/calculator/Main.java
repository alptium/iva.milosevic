package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
		     
			System.out.println("Enter your first number");  
			int x = sc.nextInt(); 
			
			System.out.println("Choose the operation +, -, *, / ");  
			String op = sc.next(); 
			
			System.out.println("Enter your second number");  
			int y = sc.nextInt(); 
			
			int z = 0;
			
			if(op.equals("+")) {
				z = x + y;
			} else if(op.equals("-")) {
				z = x - y;
			} else if(op.equals("*")) {
				z = x * y;
			} else if(op.equals("/")) {
				z = x / y ;
			}			
			
			System.out.println("First number is: " + x);
			System.out.println("Second number is: " + y);
			System.out.println("The result of operaton is: " + z);
		}
	}	
}