import java.util.*;

public class DiceMain{
	public static void main(String[] args){
		Scanner s = new  Scanner(System.in);
		int rolls;
		
		System.out.println("How many rolls would you like to simulate? ");
		do{
			rolls = s.nextInt();
		}
		while(rolls<1);
		DiceRoll2 d = new DiceRoll2(rolls);
		d.rollDice();
		
		System.out.println("\n" + d.getNums());
		System.out.println("\n" + d);
	}
}