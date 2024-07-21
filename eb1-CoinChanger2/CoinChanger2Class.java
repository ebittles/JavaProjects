import java.util.*;

public class CoinChanger2Class{
	private int dollarCost, centCost, totalCostC;
	private int dollarPaid, centPaid, totalPaidC;
	private int dollarChange, centChange, totalChangeC;
	private int remainingChange;
	Random r = new Random();
	
	public CoinChanger2Class(){
		dollarCost = r.nextInt(10)+1;
		centCost = r.nextInt(100);
		totalCostC = dollarCost*100 + centCost;
	}
	
	public void setAmtPaid(double c){
		totalPaidC = (int)(c*100 + .1);
		centPaid = totalPaidC%100;
		dollarPaid = (totalPaidC - centPaid)/100;
		
		totalChangeC = totalPaidC - totalCostC;
		centChange = totalChangeC%100;
		dollarChange = (totalChangeC - centChange)/100;
	}
	
	public double cost(){
		return (double)totalCostC/100 + .001;
	}
	
	public double getAmtPaid(){
		return (double)totalPaidC/100 + .001;
	}
	
	public int getChangeD(){
		return dollarChange;
	}
	
	public int getChangeC(){
		remainingChange = centChange;
		return centChange;
	}
	
	public String quarters(){
		int quarters = 0;
		while(remainingChange >= 25){
			remainingChange -=25;
			quarters++;
		}
		String q = quarters + " quarter";
		if(quarters!=1){
			q+="s";
		}
		return q;
	}
	
	public String dimes(){
		int dimes = 0;
		while(remainingChange >= 10){
			remainingChange -= 10;
			dimes++;
		}
		String d = dimes + " dime";
		if(dimes!=1){
			d+="s";
		}
		return d;
	}
	
	public String nickels(){
		int nickels = 0;
		while(remainingChange >= 5){
			remainingChange -= 5;
			nickels++;
		}
		String n = nickels + " nickel";
		if(nickels!=1){
			n+="s";
		}
		return n;
	}
	
	public String pennies(){
		int pennies = remainingChange;
		String p = pennies + " penn";
		if(pennies!=1){
			p += "ies";
		}else{
			p += "y";
		}
		return p;
	}
}