import java.util.*;

public class GradeCalcMain {
	public static void main(String[] args){
		int grade1,grade2,grade3;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter first grade: ");
		grade1 = k.nextInt();
		while(grade1<0 || grade1>50){
			System.out.println("Please enter a number from 0-50");
			grade1 = k.nextInt();
		}
		
		System.out.println("Enter first grade: ");
		grade2 = k.nextInt();
		while(grade1<0 || grade1>50){
			System.out.println("Please enter a number from 0-50");
			grade2 = k.nextInt();
		}
		
		System.out.println("Enter first grade: ");
		grade3 = k.nextInt();
		while(grade1<0 || grade1>50){
			System.out.println("Please enter a number from 0-50");
			grade3 = k.nextInt();
		}
		
		GradeCalcClass g = new GradeCalcClass(grade1, grade2, grade3);
		System.out.println("Your final grade is " + g);
		
		
	}
}