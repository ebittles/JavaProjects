import java.util.*;

public class ChangeClass{
	private double dCost, cCost, tCostCents;
	private double dPaid, cPaid, tPaidCents;
	private double dChange, cChange, tChangeCents;
	private double centsRemaining;
	Random r = new Random();
	
	public ChangeClass(){
		dCost = r.nextInt(1000) + 1;
		cCost = r.nextInt(100);
		tCostCents = 100*dCost + cCost;
	}
	
	public void setPaid(double cashPaid){
		tPaidCents = (int)(100*cashPaid+0.1);
		cPaid = tPaidCents%100;
		dPaid = (tPaidCents-cashPaid)/100;
		
		tChangeCents = tPaidCents - tCostCents;
		cChange = tChangeCents%100;
		dChange = (tChangeCents - cChange)/100;
		
		centsRemaining = cChange;
	}
	
	public double getCost(){
		return (double)tCostCents/100 + .001;
	}
	
	public double getPaid(){
		return (double)tPaidCents/100 + .001;
	}
	
	public double getChangeDollars(){
		return dChange;
	}
	
	public double getChangeCents(){
		return cChange;
	}
	
	public String getQuarters(){
		int q = 0;
		while(centsRemaining>=25){
			centsRemaining -=25;
			q++;
		}
		String o = q + " quarter";
		if(q!=1){o+="s";}
		return o;
	}
	
	
	public String getDimes(){
		int q = 0;
		while(centsRemaining>=10){
			centsRemaining -=10;
			q++;
		}
		String o = q + " dime";
		if(q!=1){o+="s";}
		return o;
	}
	
	public String getNickels(){
		int q = 0;
		while(centsRemaining>=5){
			centsRemaining -=5;
			q++;
		}
		String o = q + " nickle";
		if(q!=1){o+="s";}
		return o;
	}
	
	public String getPennies(){
		int q = 0;
		while(centsRemaining>=1){
			centsRemaining -=1;
			q++;
		}
		String o = q + " penn";
		if(q!=1){o+="ies";}else{o+="y";}
		return o;
	}
	
	public String toString(){
		return "\n\t" + getQuarters() + "\n\t" + getDimes() + "\n\t" + getNickels() + "\n\t" + getPennies();
	}
}