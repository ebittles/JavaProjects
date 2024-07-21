import java.util.*;

public class TrainMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		boolean again = true;
		
		do{
			System.out.println("To determine the mileage between cities, enter the number of two cities from the following list:\n");
			System.out.println("1: Albany\t 4: NY");
			System.out.println("2: Boston\t 5: Philadelphia");
			System.out.println("3: Hartford\n");
			
			System.out.println("Enter starting city: ");
			int a = s.nextInt();
			System.out.println("Enter your final destination: ");
			int b = s.nextInt();
			System.out.println("If you with to travel through a third ciry enter the number. If not enter 0: ");
			int c = s.nextInt();
			
			TrainClass t = new TrainClass(a,b,c);
			
			System.out.println(t);
			
			System.out.println("\nWould you like to repeat the test? (Y/N) ");
				String playAgain = s.next().toUpperCase();
				if(!playAgain.equals("Y")){
					again = false;
				}
			
		}
		while(again);
			
	}
}