import java.util.*;

public class Counter2Class{
	private int numIter;
	Random r = new Random();
	ArrayList<Integer> nums = new ArrayList<Integer>();
	ArrayList<Integer> counts = new ArrayList<Integer>();

	
	public Counter2Class(int i){
		numIter = i;
		for (int x = 0; x < 51; x++) {
		  counts.add(0);
		}
	}
	
	public void calc(){
		for(int x=0;x<numIter;x++){
			int num = r.nextInt(51);
			nums.add(num);
			counts.set(num, counts.get(num)+1);
		}
	}
	
	public String toString(){
		String nString = "";
		for(int n=0;n<nums.size();n++){
			nString+=nums.get(n)+"\n";
		}
		String dist = "The distribution of numbers are:\n";
		for(int n=0;n<counts.size();n++){
			if(counts.get(n)!=0){
				dist+=n+"\t"+counts.get(n)+" times\n";	
			}

		}
		return nString +"\n\n"+dist;
	}
}