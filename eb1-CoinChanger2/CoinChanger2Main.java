import java.util.*;
import java.text.*;

public class CoinChanger2Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat m = new DecimalFormat("$0.00");
		DecimalFormat cents = new DecimalFormat("00 cents");
		CoinChanger2Class c = new CoinChanger2Class();
		
		String input = "Amount of purchase: ";
		input += m.format(c.cost());
		input += "\nCash tendered: ";
		System.out.print(input);
		c.setAmtPaid(s.nextDouble());
		
		while(c.getAmtPaid() < c.cost()){
			System.out.println("Please enter an amount more than the cost of the item: ");
			c.setAmtPaid(s.nextDouble());			
		}
		
		String out = "\nAmount of Purchase: ";
		out += m.format(c.cost());
		out += "\nCash tendered: ";
		out += m.format(c.getAmtPaid());
		out += "\nDollars returned: ";
		out += m.format(c.getChangeD());
		out += "\nCents returned: ";
		out += cents.format(c.getChangeC()) + "\n";
		System.out.print(out);
		
		System.out.println();
		System.out.println("Quarters: " + c.quarters());
		System.out.println("Dimes: " + c.dimes());
		System.out.println("Nickels: " + c.nickels());
		System.out.println("Pennies: " + c.pennies());		
	}
}