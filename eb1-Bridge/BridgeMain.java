import java.util.*;

public class BridgeMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		BridgeClass b = new BridgeClass();
		Boolean again = true;
		
		do{
			b.newHand();
			System.out.println(b);
		
			System.out.println("Would you like to generate new hands? (Y/N) ");
			if(!s.next().toUpperCase().equals("Y")){
				again=false;
			}
		}
		while(again);
		
	}
}