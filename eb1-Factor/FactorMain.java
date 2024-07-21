import java.util.*;

public class FactorMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		boolean again = true;
		int x = 0;
			
			do {
				System.out.println("Enter an Integer: ");
				int n = s.nextInt();
				
				FactorClass f = new FactorClass(n);
				f.calculate();
				System.out.println(f);
				
				System.out.println("\nWould you like to repeat? (Y/N) ");
				String playAgain = s.next().toUpperCase();
				if(!playAgain.equals("Y")){
					again = false;
				}
				
			}
			while(again);
	}
}