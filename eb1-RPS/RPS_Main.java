import java.util.*;

public class RPS_Main{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		Boolean again = true;
		RPS_Class c = new RPS_Class();
		
		do{
			System.out.println("Enter your move (R/P/S): ");
			String move = s.next().toUpperCase();
			System.out.println(c.playGame(move));
			System.out.print(c);
			
			System.out.println("\nWould you like to try again? Y/N ");
			String a = s.next().toUpperCase();
			if(!a.equals("Y")){
				again = false;
			}
		}
		while(again);
	}
}
