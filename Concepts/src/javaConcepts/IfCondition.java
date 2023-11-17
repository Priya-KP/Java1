package javaConcepts;

import java.util.Scanner;

public class IfCondition {
	
	public static void main(String args[]) {
		
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Please enter your age : ");
	
	 int age = obj.nextInt();
		
		if(age>60) {
			
			System.out.println("Senior citizen");
		}else if(age>18 && age<=60){
			
			System.out.println("Adults");
		}
		else {
			System.out.println("Minor");
		}
	}

}
