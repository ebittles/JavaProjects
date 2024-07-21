import java.util.*;

public class CoinChangerMain {
	public static void main(String[] args){
		
		int pennies, nickels, dimes, quarters;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the number of pennies");
		pennies = scan.nextInt();
		System.out.println("Enter the number of nickels");
		nickels = scan.nextInt();
		System.out.println("Enter the number of dimes");
		dimes = scan.nextInt();
		System.out.println("Enter the number of quarters");
		quarters = scan.nextInt();
		
		CoinChangerClass coin1 = new CoinChangerClass(pennies, nickels, dimes, quarters);
		System.out.println("\n" + coin1);
		System.out.println("You have " + coin1.findCentsValue() + " cents");
		System.out.println("You have " + coin1.findDollars() + " whole dollars");
		System.out.println("You have " + (int)coin1.findChange() + " cents in change");
		
		System.out.println("\nThis includes a default constructer. This will be your new default.");
		
		CoinChangerClass coin2 = new CoinChangerClass();
		System.out.println("\n" + coin2);
		System.out.println("You have " + coin2.findCentsValue() + " cents");
		System.out.println("You have " + coin2.findDollars() + " whole dollars");
		System.out.println("You have " + coin2.findChange() + " cents in change");
		
		System.out.println("\nYou can also set the number of coins indiviudally.");
		System.out.println("For example, the coins are set to 1 penny 2 nickels 3 dimes and 4 quarters");
		
		coin2.setPennies(1);
		coin2.setNickels(2);
		coin2.setDimes(3);
		coin2.setQuarters(4);
		
		System.out.println("\nThe number of pennies, nickels, dimes, and quarters is " +
		coin2.getPennies() + ", " + coin2.getNickels() + ", " + coin2.getDimes() + ", and " +
		coin2.getQuarters());
		
		System.out.println("\n" + coin2);
		System.out.println("You have " + coin2.findCentsValue() + " cents");
		System.out.println("You have " + coin2.findDollars() + " whole dollars");
		System.out.println("You have " + coin2.findChange() + " cents in change");
	}
}