import java.util.*;

public class ConcentrationMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		boolean repeat = true;
		
		do{
			ConcentrationClass c = new ConcentrationClass();
			TimeTest t = new TimeTest();
			
			t.startClock();
			
			while(c.playing()){
				System.out.println(c.activeGame());
				System.out.println("Enter your first guess: ");
				int guess1 = s.nextInt();
				System.out.println(c.guess(guess1));
				System.out.println("Enter your second guess: ");
				System.out.println(c.guess(guess1, s.nextInt()));
				System.out.println("\n");				
			}
			
			t.stopClock();
			
			System.out.println("You won in " + t);
			System.out.println("Would you like to go again (Y/N)? ");
			String playAgain = s.next().toUpperCase();
			if(!playAgain.equals("Y")){
				repeat = false;
			}
		}
		while(repeat);
	}
}