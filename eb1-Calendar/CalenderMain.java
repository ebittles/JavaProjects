import java.util.*;

public class CalenderMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int month,year;
		boolean repeat = true;
		
		do{
			System.out.println("Enter Month: ");
			month = s.nextInt();
			while(month<1||month>12){
				System.out.println("Please enter a valid month: ");
				month = s.nextInt();
			}
			System.out.println("Enter year: ");
			year = s.nextInt();
			
			CalendarClass c = new CalendarClass(month, year);
			System.out.println(c);
			
			System.out.println("Would you like to generate another calendar (Y/N)? ");
			String playAgain = s.next().toUpperCase();
			if(!playAgain.equals("Y")){
				repeat = false;
			}
		}
		while(repeat);
	}
}