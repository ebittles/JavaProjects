import java.text.DecimalFormat;

public class QuadForm {
	
	private int a,b,c;
	private double discriminate;
	
	DecimalFormat output = new DecimalFormat("0.00");

	public QuadForm(int a1, int b1, int c1){
		a = a1;
		b = b1;
		c = c1;
		discriminate = b*b - 4*a*c;
	}
	
	public QuadForm(){
		a = 0;
		b = 0;
		c = 0;
		discriminate = b*b - 4*a*c;
	}
	
	public String toString(){
		if (discriminate >= 0){
			double root1 = (-b + Math.sqrt(discriminate))/(2*a);
			double root2 = (-b - Math.sqrt(discriminate))/(2*a); 
			return "Root 1: " + output.format(root1) + "\tRoot 2: " + output.format(root2); 
		}else if (discriminate == 0){
            double root = -b/(2.0 * a);
            return "Root: " + output.format(root);
		}else{
			double real = -b/(2.0*a);
			double imag = Math.sqrt(-discriminate)/(2*a);
			String root1 = output.format(real) + "+" + output.format(imag) + "i";
			String root2 = output.format(real) + "-" + output.format(imag) + "i";
			return "Root 1: " + root1 + "\tRoot 2: " + root2;
		}
	}
}