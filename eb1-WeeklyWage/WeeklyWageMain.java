import java.util.*;

public class WeeklyWageMain {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		double hours, rate;
		String exempt;
		
		System.out.print("Enter hours worked: ");
		hours = scan.nextDouble();
		System.out.print("Enter hourly rate: ");
		rate = scan.nextDouble();
		System.out.print("Exempt (Y/N): ");
		exempt = scan.next().toUpperCase();
		
		WeeklyWageClass w = new WeeklyWageClass(hours, rate, exempt);
		
		System.out.println("\n" + w);
		
	}
}