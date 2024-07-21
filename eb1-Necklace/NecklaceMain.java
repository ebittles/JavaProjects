import java.util.*;

public class NecklaceMain{
	public static void main(String[] args){
		int a,b;
		Scanner s = new Scanner(System.in);
		boolean again = true;
			
			do {
				System.out.println("Input at number 0-9: ");
				a = s.nextInt();
				while(a>9||a<0){
					System.out.println("The number has to be 0-9: ");
					a = s.nextInt();
				}
				
				System.out.println("Input at second number 0-9: ");
				b = s.nextInt();
				while(b>9||b<0){
					System.out.println("The number has to be 0-9: ");
					b = s.nextInt();
				}
				
				NecklaceClass n = new NecklaceClass(a,b);
				n.calculate();
				System.out.println(n.listNums());
				System.out.println(n);
				
				System.out.println("\nWould you like to repeat the test? (Y/N) ");
				String playAgain = s.next().toUpperCase();
				if(!playAgain.equals("Y")){
					again = false;
				}
				
			}
			while(again);
	}
}