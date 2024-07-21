import java.util.Arrays;
import java.util.Random;
import java.text.*;

public class DuplicateClass {
    DecimalFormat f = new DecimalFormat("0.00%");
    
    private int num;
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    
    public DuplicateClass(int n){
    	num = n;
    }
    
    
    public void genArrays(){
    	a1 = randArray();
    	a2 = randArray();
    }


    public int[] randArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*99 + 1);
        }
        return array;
    }


    private boolean checkNums(int[] array1, int[] array2) {
        for(int a: array1){  
            for (int b: array2) {
                if (a == b) {
                    return true;
                }
            }
         
        }
    
        return false;
    }
    
    public String toString(){
    	int dup = 0;
    	
    	for(int i=0;i<num;i++){
    		genArrays();
    		if(checkNums(a1,a2)){
    			dup++;
    			
    		}   		
    	}
    	
    	return f.format(((double)dup/num)) + "";
    	
    }
}
