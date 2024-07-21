public class ComplexNumberMain{
	public static void main(String[] args){
		
		ComplexNumber a = new ComplexNumber(5,1);
		ComplexNumber b = new ComplexNumber(4,-3);
		ComplexNumber c = new ComplexNumber();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		a.setReal(3);
		a.setImag(2);
		
		System.out.println(a.real());
		System.out.println(a.imag());
		
		System.out.println();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		System.out.println(a.multiply(a.conjugate()));
		System.out.println(a.r());
		System.out.println(a.theta());
	}
}