import java.util.*;

public class StringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name;
			System.out.println("Enter a name: ");
			Scanner sn= new Scanner(System.in);
			
			name= sn.nextLine();
			
			int l= name.length();
			System.out.println(name.charAt(0) +" "+ name.charAt(l-1));
	}

}
