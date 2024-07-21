import java.util.*;
import java.text.*;

public class ChangeMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("$0.00");
		DecimalFormat c = new DecimalFormat("00 c");
		ChangeClass a = new ChangeClass();
		
		String input = "Amount of Purchase: ";
		input+=d.format(a.getCost());
		input+="\nAmount Tendered: ";
		System.out.println(input);
		a.setPaid(s.nextDouble());
		
		while(a.getPaid() < a.getCost()){
			System.out.println("Enter and amount greater than the cost!");
			System.out.println(a.getPaid());
			System.out.println(a.getCost());
			System.out.println("\nAmount Tendered: ");
			a.setPaid(s.nextDouble());
		}
		
		String o = "\n Amount of purchase: ";
		o += d.format(a.getCost());
		o += "\n Amount Tendered: ";
		o += d.format(a.getPaid());
		o += "\n\n\t Dollars returned: ";
		o += d.format(a.getChangeDollars());
		o += "\n\t Cents returned: ";
		o += c.format(a.getChangeCents());
		
		System.out.println(o);
		System.out.println(a);
	}
}