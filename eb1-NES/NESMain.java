import java.util.*;
import java.text.*;

public class NESMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("$0.00");
		
		int choice = 0;
		double watts, demand;
		
		do {
			System.out.println("1. Residential\n2. Commercial\n\n3. Exit");
			choice = s.nextInt();
			if(choice==1){
				System.out.println("Kilowatt Hours: ");
				watts = s.nextDouble();
				Residential r = new Residential(watts);
				System.out.println(d.format(r.getTotal())+"\n");
			}
			if(choice==2){
				System.out.println("Kilowatt Hours: ");
				watts = s.nextDouble();
				System.out.println("Demand Charge: ");
				demand = s.nextDouble();
				Commercial c = new Commercial(demand, watts);
				System.out.println(d.format(c.getTotal())+"\n");
			}
		}
		while(choice!=3);
	}
}