import java.util.*;

public class Array2Class{
	private int num;
	private int choice;
	static ArrayList<Integer> nums = new ArrayList<Integer>();
	private Random r = new Random();
	
	public Array2Class(){
		num = 0;
		choice = 9;
	}
	public Array2Class(int a, int b){
		num = a;
		choice = b;
	}
	
	private ArrayList genNums(ArrayList n){
		for(int i=0;i<1000;i++){
			n.add(r.nextInt(90)+10);
		}
		return n;
	}
	
	private String output(ArrayList n){
		String out = "";
		for(int i = 0;i<n.size();i++){
			out += n.get(i) + "\t";
		}
		return out;
	}
	
	private String search(int x, ArrayList n){
		String out="";
		int count = 0;
		ArrayList<String> idx = new ArrayList<String>();
		
		for(int i=0;i<1000;i++){
			if(n.get(i)==x){
				count++;
				idx.add(""+i);
			}
		}
		if(count==0){
			out+=" No results found";
		}else{
			out+=x + " appears " + count + " times. The indexes are "+idx;
		}
		return out;
	}
	
	private void sort(ArrayList arr){
		int n = arr.size();
		for (int i = 0; i < n - 1; i++) { 
            int min_idx = i; 
            for (int j = i + 1; j < n; j++) { 
                if ((int)arr.get(j) < (int)arr.get(min_idx)) 
                    min_idx = j; 
            } 
            int temp = (int)arr.get(min_idx); 
            arr.set(min_idx, arr.get(i));
			arr.set(i, temp);
        } 
	}
	
	private void rsort(ArrayList n){
		sort(n);
		ArrayList temp = new ArrayList();
		for(int i=n.size()-1;i>0;i--){
			temp.add(n.get(i));
		}
		n = temp;
	}
	
	private String max(ArrayList<Integer> n){
		int l = Collections.max(n);
		int count = 0;
		for(int x: n){
			if(x==l){
				count++;
			}
		}
		return "The largest number is: " + l + " and it occurs " + count + " times";
	}
	
	private String min(ArrayList<Integer> n){
		int s = Collections.min(n);
		int count = 0;
		for(int x: n){
			if(x==s){
				count++;
			}
		}
		return "The smallest number is: " + s + " and it occurs " + count + " times";
	}
	
	private ArrayList copy(ArrayList n){
		return new ArrayList<Integer>(n);
	}
	
	private int sum(ArrayList<Integer> n){
		int sum = 0;
		for(int x:n){
			sum+=x;
		}
		return sum;
	}
	
	public String toString(){
		if(nums.isEmpty()){
			genNums(nums);
		}
		String out = "\n\nYour base ArrayList is\n"+output(nums)+"\n\n";
		
		switch(choice){
			case 1:
				nums.clear();
				genNums(nums);
				out+="\n\nYour new ArrayList is\n"+output(nums)+"\n\n";
				break;
			case 2:
				out+="\n\n"+search(num,nums);
				break;
			case 3:
				sort(nums);
				out+="\n\nYour new ArrayList is\n"+output(nums)+"\n\n";
				break;
			case 4:
				rsort(nums);
				out+="\n\nYour new ArrayList is\n"+output(nums)+"\n\n";
				break;
			case 5:
				out+="\n\n"+max(nums);
				break;
			case 6:
				out+="\n\n"+min(nums);
				break;
			case 7:
				copy(nums);
				out+="\n\nYour old ArrayList is\n"+output(nums)+"\n\n";
				out+="\n\nYour copied ArrayList is\n"+output(nums)+"\n\n";
				break;
			case 8:
				out+="\n\nThe sum is: " + sum(nums);
				break;
				
		}
		return out;
	}
}