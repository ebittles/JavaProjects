import java.util.*;

public class Counter2Main {
	public static void main(String[] args){
	
		int iter;
		Scanner s = new Scanner(System.in);
		boolean again = true;
			
			do {
				System.out.println("How many numbers do you want generated? ");
				iter = s.nextInt();
				
				while(iter<0){
					System.out.println("Please enter a positive number");
					iter = s.nextInt();
				}
				Counter2Class c = new Counter2Class(iter);
				c.calc();
				System.out.println("\n"+c);
				
				System.out.println("\nWould you like to repeat the test? (Y/N) ");
				String playAgain = s.next().toUpperCase();
				if(!playAgain.equals("Y")){
					again = false;
				}
				
			}
			while(again);
	}
	
}