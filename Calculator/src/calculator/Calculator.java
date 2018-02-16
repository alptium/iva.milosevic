package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
			int x;
			int y;
			int z;

			try(Scanner sc = new Scanner(System.in)) {
		     
			System.out.println("Unesite prvi broj");  
			x = sc.nextInt(); 
			
			System.out.println("Izaberite operaciju +, -, *, / ");  
			String op = sc.next(); 
			
			System.out.println("Unesite drugi broj");  
			y = sc.nextInt(); 
			
	        z = 0;
			
			if(op.equals("+")){
				z = x + y;
			}else if(op.equals("-")){
				z = x - y;
			}else if(op.equals("*")){
				z = x * y;
			}else if(op.equals("/")){
				z = x / y ;
			}			
			
			System.out.println("Prvi broj je " + x);
			System.out.println("Drugi broj je " + y);
			System.out.println("Rezultat operacije je: " + z);
		
		}
	}
	
}