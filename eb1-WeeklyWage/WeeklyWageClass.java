import java.text.DecimalFormat;

public class WeeklyWageClass {
	public final double TAX = 0.18;
	private double hours,rate;
	String exempt;
	
	DecimalFormat output = new DecimalFormat("$0.00");
	
	public WeeklyWageClass(double h, double r, String e){
		hours = h;
		rate = r;
		exempt = e;
	}
	
	public double deductTax(){
		return wage()*TAX;
	}
	public double wage(){
		double overtime = 0.00;
		overtime = (hours-40)*1.5*rate;
		
		if(hours<=40){
			return hours*rate;
		}else{
			return rate*40 + overtime;
		}
		
	} 
	public String exemptValue(){
		if(exempt.equals("Y")){
			return "NO TAX DEDUCTED";
		} else {
			return "Taxes deducted = " + output.format(deductTax());
		}
	}
	public String toString(){
		return "Wages earned = " + output.format(wage()) + "\n" + exemptValue();
	}
}