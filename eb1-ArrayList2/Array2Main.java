import java.util.*;

public class Array2Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int choice = 0;
		int number = 0;
		
		while(choice!=9){
			System.out.println("1. Generate new array\n2. Search array\n3. Sort array\n4. Reverse sort array\n5. Find largest value\n6. Find smallest value\n7. Copy array\n8. Sum array\n9. Exit");
			System.out.println("Enter your choice: ");
			choice = s.nextInt();
			
			if(choice==2){
				System.out.println("Enter a number to search for: ");
				number = s.nextInt();
			}
			
			Array2Class a = new Array2Class(number, choice);
			System.out.println(a);
		}
	}
}