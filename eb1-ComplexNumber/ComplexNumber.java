import java.text.*;

public class ComplexNumber{
	
	DecimalFormat d = new DecimalFormat("#.##");
	DecimalFormat d2 = new DecimalFormat("#.###");
	
	private double real,imag;
	
	public ComplexNumber(double r, double i){
		real = r;
		imag = i;
	}
	
	public ComplexNumber(){
		real = 0;
		imag = 0;
	}
	
	public double real(){
		return real;
	}
	
	public double imag(){
		return imag;
	}
	
	public void setReal(double r){
		real = r;
	}
	
	public void setImag(double i){
		imag = i;
	}
	
	public ComplexNumber add(ComplexNumber c){
		double r = real + c.real;
		double i = imag + c.imag;
		return new ComplexNumber(r,i);
	}
	
	public ComplexNumber subtract(ComplexNumber c){
		double r = real - c.real;
		double i = imag - c.imag;
		return new ComplexNumber(r,i);
	}
	
	public ComplexNumber multiply(ComplexNumber c){
		double r = real*c.real - imag*c.imag;
		double i = real*c.imag + imag*c.real;
		return new ComplexNumber(r,i);
	}
	
	public ComplexNumber reciprocal(){
		double s = real*real + imag*imag;
		return new ComplexNumber(real/s, -imag/s);
	}
	
	public ComplexNumber divide(ComplexNumber c){
		return this.multiply(c.reciprocal());
	}
	
	public ComplexNumber conjugate(){
		return new ComplexNumber(real, -imag);
	}
	
	public String r(){
		return d2.format(Math.sqrt(real*real + imag*imag));
	}
	
	public String theta(){
		return d2.format(Math.atan(imag/real));
	}
	
	public String toString(){
		if(imag==0){
			return d.format(real) + "";
		}
		if (imag>=0){
			return d.format(real) + " + " + d.format(imag) + "i";
		}else{
			return d.format(real) + " - " + d.format(-imag) + "i";
		}
		
	}
}