import java.util.*;

public class NumberGuessClass{
	
	int num, guess;
	int numGuesses = 1;
	
	public NumberGuessClass(){
		num = (int)(Math.random()*100)+1;
	}
	
	public boolean checkGuess(int g){
		guess = g;
		return guess == num;
	}
	
	public int numGuesses(){
		return numGuesses;
	}
	
	public String toString(){
		if(guess<1||guess>100){
			return "Please enter a number 1-100";
		}else{
			numGuesses++;
			if (guess>num){
				return "Your guess is too high";
			}else if (guess<num){
				return "Your guess is too low";
			}else{
				return null;
			}
		}
		
	}
}