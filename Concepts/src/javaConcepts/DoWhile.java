package javaConcepts;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Temperature to set : ");
		
		int currentTemp = 50;
		
		int givenTemp = obj.nextInt();
		
		do {
			
			System.out.println("currentTemp : " + ++currentTemp);
			
		}while(currentTemp<givenTemp);
		
		System.out.println("Temperature is set to " +givenTemp );
	}

}
