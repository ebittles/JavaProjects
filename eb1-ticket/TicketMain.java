import java.util.*;

public class TicketMain {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double weight, cost;
		String description;
		
		System.out.println("This program calculates the total cost of some items.");
		System.out.println("\nEnter each of the followning \n");
		
		System.out.print("Description of the item: ");
		description = scan.nextLine();
		
		System.out.print("Weight of item (lbs): ");
		weight = scan.nextDouble();
		
		System.out.print("Price per lb of item: ");
		cost = scan.nextDouble();
		
		TicketClass t = new TicketClass(description, weight, cost);
		System.out.print(t);
		
	}
}