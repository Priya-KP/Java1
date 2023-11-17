package javaConcepts;
import java.util.*;

public class WhileLoop {

	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Temperature to set : ");
		
		int currentTemp = 50;
		
		int givenTemp = obj.nextInt();
		
		while(currentTemp<givenTemp) {
			
					
			System.out.println("currentTemp : " +currentTemp++);
			
		}
		
		System.out.println("Temperature is set to " +givenTemp );
		
		
	}
}
