import java.util.*;

public class NumberGuessMain{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		NumberGuessClass g = new NumberGuessClass();
		boolean playAgain = false;
		
		
		do {
			System.out.println("Enter a number 1-100");
			while(!g.checkGuess(scan.nextInt())){
				System.out.println(g);
			}
			System.out.println("You Win!!! It took " + g.numGuesses() + " guesses!");
			System.out.println("Would you like to play again? (Y/N) ");
			String pa = scan.next().toUpperCase();
			if (pa.equals("Y")){
				playAgain = true;
			}
		}
		while(playAgain);
		
	}
}