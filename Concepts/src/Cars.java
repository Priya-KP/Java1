import java.util.*;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome!!!");
		System.out.println("Do you like cars? ");
		Scanner a=new Scanner(System.in);
		String yn=a.nextLine();
		//System.out.println(yn);
		System.out.println("Enter the number of cars you know: ");
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		System.out.println("List the cars you know: ");
		Scanner b=new Scanner(System.in);
		String[] carList=new String[num];
		for(int i=0; i<num; i++) {
			carList[i]=b.nextLine();
		}
		System.out.println("Enter the first letter of your favourite car: ");
		Scanner c=new Scanner(System.in);
		String fletter=c.nextLine();
		System.out.println("Cars starting with "+fletter +" are:");
		for(String car : carList) {
			if(car.startsWith(fletter.toLowerCase())||car.startsWith(fletter.toUpperCase()))
			{
				System.out.println(car);
			}
		}
		}
}