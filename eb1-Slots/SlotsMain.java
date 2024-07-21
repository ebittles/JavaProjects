import java.util.*;

public class SlotsMain{
	public static void main(String[] args){
		
		Boolean again = true;
		Scanner s = new Scanner(System.in);
		SlotsClass a = new SlotsClass();
		
		do{
			System.out.println(a.play());
			System.out.println(a);
			System.out.println("\nWould you like to try again? Y/N ");
			String b = s.next().toUpperCase();
			if(!b.equals("Y")){
				again = false;
			}
		}while(again);
		
		

	}
}