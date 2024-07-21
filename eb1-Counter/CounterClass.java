import java.util.*;

public class CounterClass{
	private int numIter;
	Random r = new Random();
	int[] nums;
	int[] counts = new int[51];
	
	public CounterClass(int i){
		numIter = i;
	}
	
	public void calc(){
		nums = new int[numIter];
		for(int x=0;x<numIter;x++){
			int num = r.nextInt(51);
			nums[x] = num;
			counts[num]++;
		}
	}
	
	public String toString(){
		String nString = "";
		for(int n=0;n<nums.length;n++){
			nString+=nums[n]+"\n";
		}
		String dist = "The distribution of numbers are:\n";
		for(int n=0;n<counts.length;n++){
			if(counts[n]!=0){
				dist+=n+"\t"+counts[n]+" times\n";	
			}

		}
		return nString +"\n\n"+dist;
	}
}