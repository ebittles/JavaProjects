import java.util.*;
import java.text.*;

public class LargoClass{
	Random r = new Random();
	DecimalFormat d = new DecimalFormat("000");
	private final int ROWS = 10; int COL = 10;
	private int[][] LArray;
	
	private void calcArray(){
		LArray = new int[ROWS][COL];
		for(int i = 0; i<LArray.length; i++){
			for(int x = 0; x<LArray[i].length; x++){
				LArray[i][x] = r.nextInt(200)+1;
			}
		}
	}
	
	private String largest(){
		int large = 0;
		int largestRow = 0;
		int largestCol = 0;
		for(int i = 0; i<LArray.length; i++){
			for(int x = 0; x<LArray[i].length; x++){
				if(LArray[i][x]>large){
					large = LArray[i][x];
					largestRow = i;
					largestCol = x;
				}
			}
		}
		return large + " at (" + (largestRow+1) + " " + (largestCol+1) + ") ";
	}
	
	private String smallest(){
		int small = 200;
		int smallestRow = 0;
		int smallestCol = 0;
		for(int i = 0; i<LArray.length; i++){
			for(int x = 0; x<LArray[i].length; x++){
				if(LArray[i][x]<small){
					small = LArray[i][x];
					smallestRow = i;
					smallestCol = x;
				}
			}
		}
		return small + " at (" + (smallestRow+1) + " " + (smallestCol+1) + ") ";
	}
	
	private int sum(){
		int sum = 0;
		for(int[] i:LArray){
			for(int x: i){
				sum += i[x];
			}
		}
		return sum;
	}
	
	public String toString(){
		calcArray();
		String str = "	1	2	3	4	5	6	7	8	9	10\n";
		for(int i = 0; i<ROWS*2; i++){
			if(i%2==0){
				str += " ";
				for(int x = 0; x<COL; x++){
					str+= "+----";
				}
				str += "+\n";
			}
			else{
				if(1+i/2==10){
					str += 1+i/2 + "";
				}else{
					str += " " + (1+i/2);
				}
				for(int x = 0; x<COL; x++){
					str += "|" + d.format(LArray[i/2][x]);
				}
				str += "|\n";
			}
		}
		str += "largest: " + largest() + "\n" + "smallest: " + smallest();
		return str;
		
	}
}