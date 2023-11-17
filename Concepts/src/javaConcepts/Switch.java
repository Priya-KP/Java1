package javaConcepts;
import java.util.*;

public class Switch {
	
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter day");
		String day= obj.nextLine();
		
	switch(day)
	{
	case "Monday":
	case "Tuesday":
	case "Wednesday":
	case "Thursday":
	case "Friday":
		System.out.println("Weekday!!");
		break;
	case "Saturday":
	case "Sunday":
		System.out.println("Weekend!!!");
		break;
	}
		
	}

}
