import java.text.DecimalFormat;

public class HClass{
	 private int[] out;
	 private int num;
	 private int largestNum =1;
	 private int big = 1;
	 private int iter = 200;
	 private int[] count = new int[iter+1];

	 DecimalFormat output = new DecimalFormat("#.##");


 public boolean IsEven(int n){
 	return (n%2==0);
 }

 public int iter(int num){
	 if(IsEven(num)){
	 	return num/2;
	 }
	 return (num*3)+1;
 }

 public void calculate(){
	 for(int i=1;i<=iter;i++){
	 	count[i]++;
	 }
	 for(int i=1;i<=iter;i++){
		 num = i;
		 while(num!=1){
			 num = iter(num);
			 count[i]++;
		 }
		 if(count[i]>largestNum){
			 largestNum = count[i];
			 big = i;
		 }
 	}
 }

 public String largestIter(){
	 out = new int[largestNum+4];
	 out[0] = big;
	 int run = big;
	 String dum = run + " runs in " + largestNum + " steps: ";
	 for(int i=1;i<=largestNum+3;i++){
		 out[i]=iter(run);
		 run = iter(run);
		 dum += out[i] + " ";
	 }
	 return dum;
 }

 public String toString(){
	 String list=" ";
	 for(int i=1;i<=iter;i++){
	 	list+= i + " has " + count[i] + " steps\n";
	 }
	 return list;
 }
 
}
