import java.util.*;

public class PennyMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Boolean again = true;
		
		do{
			PennyClass p = new PennyClass();
			System.out.println(p.genBoard());
			p.play();
			System.out.println(p.genBoard());
			System.out.println(p);
			
			System.out.println("\nWould you like to try again? Y/N ");
			String a = s.next().toUpperCase();
			if(!a.equals("Y")){
				again = false;
			}
		}
		while(again);
	}
}