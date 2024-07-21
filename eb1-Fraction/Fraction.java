public class Fraction{
	
	private int num,den;
	
	public Fraction(int n, int d){
		num = n;
		den = d;
	}
	
	public Fraction(){
		num=0;
		den=1;
	}
	
	public int num(){
		return num;
	}
	
	public int den(){
		return den;
	}
	
	public void setNum(int n){
		num = n;
	}
	
	public void setDen(int d){
		den = d;
	}
	
	public void setFraction(Fraction f){
		num = f.num;
		den = f.den;
	}
	
	public void setFraction(int n, int d){
		num = n;
		den = d;
	}
	
	public Fraction add(Fraction f){
		int numA = num*f.den + f.num*den;
		int denA = den*f.den;
		Fraction addedFraction = new Fraction(numA, denA);
		return addedFraction;
	}
	
	public Fraction subtract(Fraction f){
		int numA = num*f.den - f.num*den;
		int denA = den*f.den;
		Fraction subtractedFraction = new Fraction(numA, denA);
		return subtractedFraction;
	}
	
	public Fraction multiply(Fraction f){
		int numA = num*f.num;
		int denA = den*f.den;
		Fraction subtractedFraction = new Fraction(numA, denA);
		return subtractedFraction;
	}
	
	public Fraction divide(Fraction f){
		int numA = num*f.den;
		int denA = den*f.num;
		Fraction subtractedFraction = new Fraction(numA, denA);
		return subtractedFraction;
	}
	
	public String toString(){
		return num + "/" + den;
	}
	
}