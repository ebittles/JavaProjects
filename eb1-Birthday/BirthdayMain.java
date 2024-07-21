import java.util.*;

public class BirthdayMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numStudents, numIter = 0;
		boolean again = true;
		
		do {
			System.out.println("Please input the number of students (1-10,000): ");
			numStudents = s.nextInt();
			while(numStudents <= 0 || numStudents > 10000){
				System.out.println("Please enter a number between 1 and 10,000");
				numStudents = s.nextInt();
			}
			
			System.out.println("\nPlease input the number of iterations: ");
			numIter = s.nextInt();
			while(numIter <= 0){
				System.out.println("Please enter a positive number");
				numIter = s.nextInt();
			}
			
			BirthdayClass b = new BirthdayClass(numStudents, numIter);
			b.calc();
			System.out.println(b);
			
			System.out.println("\nWould you like to repeat the test? (Y/N) ");
			String playAgain = s.next().toUpperCase();
			if(!playAgain.equals("Y")){
				again = false;
			}
			
		}
		while(again);
	}
}