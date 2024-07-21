import java.util.*;

public class ScoreWeightMain{
	public static void main(String [] args){
		
	
		Scanner reader = new Scanner(System.in);
		
		int test1,test2,test3;		
		
		System.out.print("Enter first test score: ");
		test1 = reader.nextInt();
		System.out.print("Enter second test score: ");
		test2 = reader.nextInt();
		System.out.print("Enter third test score: ");
		test3 = reader.nextInt();
		
		ScoreWeightClass s = new ScoreWeightClass(test1,test2,test3);
		
		System.out.println("The weighted value of the first score is "+s.weightOne());
		System.out.println("The weighted value of the first second is "+s.weightTwo());
		System.out.println("The weighted value of the first third is "+s.weightThree());
		
		System.out.println("\nThe weighted average is "+s.sum());
		System.out.println("\nThank you for using the ScoreWeight program.");

	}	
}