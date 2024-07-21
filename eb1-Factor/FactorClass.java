import java.util.*;

public class FactorClass{
	private ArrayList<Integer> pFactors;
	private int start, num;
	
	public FactorClass(int n){
		start = n;
		num = n;
		pFactors = new ArrayList<Integer>();
	}
	
	public void calculate(){
		for(int i=2; i<=num; i++){
			if(num%i==0){
				pFactors.add(i);
				num/=i;
			}
		}
	}
	
	public ArrayList<Integer> listFactor(){
		return pFactors;
	}
	
	public String toString(){
		if(start!=1){
			return "Prime Factors: " + pFactors;
		}else{
			return "Cannot be factored";
		}
		
	}
}