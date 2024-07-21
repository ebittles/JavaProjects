public class CoinChangerClass {
	
	int pennies, nickels, dimes, quarters;
	
	public CoinChangerClass(int p, int n, int d, int q){
		pennies = p;
		nickels = n;
		dimes = d;
		quarters = q;
	}
	public CoinChangerClass(){
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	public int findCentsValue(){
		return pennies + nickels*5 + dimes*10 + quarters*25;
	}
	public int findDollars(){
		return findCentsValue()/100;
	}
	public double findChange(){
		return findCentsValue()%100;
	}
	public int getPennies(){
		return pennies;
	}
	public int getNickels(){
		return nickels;
	}
	public int getDimes(){
		return dimes;
	}
	public int getQuarters(){
		return quarters;
	}
	public void setPennies(int i){
		pennies = i;
	}
	public void setNickels(int i){
		nickels = i;
	}
	public void setDimes(int i){
		dimes = i;
	}
	public void setQuarters(int i){
		quarters = i;
	}
	public String toString(){
		return pennies + " pennies, " + nickels + " nickels, " +
		dimes + " dimes, and " + quarters+ " quarters";
	} 
}