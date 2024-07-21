import java.util.*;

public class DuplicateMain{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		Boolean again = true;
		
		do{
			System.out.println("How many interations would you like to test? ");
			int numIter = s.nextInt();
		
			DuplicateClass d = new DuplicateClass(numIter);
		
			System.out.println(d);
			
			System.out.println("\nWould you like to try again? Y/N ");
			String a = s.next().toUpperCase();
			if(!a.equals("Y")){
				again = false;
			}
		}
		while(again);
	}
}
