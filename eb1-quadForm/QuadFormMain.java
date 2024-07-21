import java.util.*;

public class QuadFormMain {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		boolean repeat = true;
		
		do{
			System.out.println("Enter the first coefficient: ");
			int a = scan.nextInt();
			System.out.println("Enter the second coefficient: ");
			int b = scan.nextInt();
			System.out.println("Enter the third coefficient: ");
			int c = scan.nextInt();
			
			
			QuadForm q = new QuadForm(a,b,c);
			System.out.println(q);
			
			System.out.println("Would you like to go again (Y/N)? ");
			String playAgain = scan.next().toUpperCase();
			if(!playAgain.equals("Y")){
				repeat = false;
			}
		}
		while(repeat);
		
	}
}