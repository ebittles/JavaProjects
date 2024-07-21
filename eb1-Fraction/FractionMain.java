import java.util.*;

public class FractionMain{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		Fraction oneHalf = new Fraction(1,2);
		Fraction oneThird = new Fraction(1,3);
		Fraction oneFourth = new Fraction(1,4);
		Fraction threeSevenths = new Fraction(3,7);
		Fraction defaultF = new Fraction();
		
		System.out.println(oneHalf.add(oneThird));
		System.out.println(oneHalf.subtract(oneThird));
		System.out.println(threeSevenths.multiply(oneHalf));
		System.out.println(oneFourth.divide(oneThird));
		System.out.println(threeSevenths.num() + "/" + threeSevenths.den());
		System.out.println(defaultF);
		
		defaultF.setNum(5);
		System.out.println(defaultF);
		defaultF.setDen(9);
		System.out.println(defaultF);
		defaultF.setFraction(oneThird);
		System.out.println(defaultF);
		defaultF.setFraction(0,1);
		System.out.println(defaultF);
		
		
	}
}