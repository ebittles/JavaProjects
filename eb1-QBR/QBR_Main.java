import java.util.*;

public class QBR_Main{
	public static void main(String[] args){
		String name;
		int attempts, completions, yds, tds, interceptions;
		Scanner s = new Scanner(System.in);
		
		boolean again = true;
			
			do {
				System.out.println("QB name: ");
				name = s.nextLine();
				
				System.out.println("Number of attempts: ");
				attempts = s.nextInt();
				
				System.out.println("Number of completions: ");
				completions = s.nextInt();
				
				System.out.println("Number of yards gained: ");
				yds = s.nextInt();
				
				System.out.println("Number of touchdown passes: ");
				tds = s.nextInt();
				
				System.out.println("Number of interceptions: ");
				interceptions = s.nextInt();
				
				qbrClass q = new qbrClass(name, attempts, completions, yds, tds, interceptions);
				System.out.println(q);
				
				System.out.println("\nWould you like to repeat the test? (Y/N) ");
				String playAgain = s.next().toUpperCase();
				if(!playAgain.equals("Y")){
					again = false;
				}
				s.nextLine();
				
			}
			while(again);
		
	}
}