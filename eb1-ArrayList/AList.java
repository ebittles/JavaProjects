import java.util.*;

public class AList{
	private ArrayList<Integer> x = new ArrayList<Integer>();
	private ArrayList<Integer> y = new ArrayList<Integer>();
	private ArrayList<Integer> z = new ArrayList<Integer>();
	
	public AList(){
		for(int i=0;i<30;i++){
			x.add(new Integer((int)(Math.random()*100+1)));
			y.add(new Integer((int)(Math.random()*100+1)));
			z.add(x.get(i)*y.get(i));
		}
	}
	
	public String table(){
		String table = "X\t Y\t Z\n";
		for(int i=0;i<30;i++){
			table += x.get(i)+"\t "+y.get(i)+"\t "+z.get(i) + "\n";
		}
		return table;
	}
	
	public String toString(){
		int sum=0;
		for(int i:z){
			sum+=i;
		}
		double sqrt = Math.sqrt(sum);
		return "Sum: " + sum + "\n" + "Sqrt: " + sqrt;
	}
}