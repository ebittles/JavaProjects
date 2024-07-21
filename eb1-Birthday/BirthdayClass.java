import java.util.*;
import java.text.*;

public class BirthdayClass{
	private int students = 0;
	private int iterations = 0;
	private Random r = new Random();
	private int numDups = 0;
	private DecimalFormat a = new DecimalFormat("0.00%");
	
	public BirthdayClass(int s, int i){
		students = s;
		iterations = i;
	}
	
	public void calc(){
		for(int i = 0; i<iterations; i++){
			Set<Integer> test = new HashSet<Integer>();
			sLoop:
			for(int y = 0; y<students; y++){
				int day = r.nextInt(365);
				if(test.add(day)==false){
					numDups++;
					break sLoop;
				}else{
					test.add(day);
				}		
				
			}					
		}
	}
	public String toString(){
		return "Percent of duplicates: " + a.format((double)numDups/iterations);
	}
}