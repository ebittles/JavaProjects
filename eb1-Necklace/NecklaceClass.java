public class NecklaceClass{
	private int a,b;
	private int[] nums = new int[201];
	private int count = 1;
	
	public NecklaceClass(int x, int y){
		a=x;
		b=y;
	}
	
	public int ones(int n){
		return n%10;
	}
	
	public void calculate(){
		nums[0] = a;
		nums[1] = b;
		nums[2] = ones(a+b);
		for(int i=1;i<200;i++){
			if(!((nums[i]==a)&&(nums[i+1]==b))){
				nums[i+2]=ones(nums[i]+nums[i+1]);
				count++;
			}else{
				return;
			}
		}
	}
	
	public String listNums(){
		String list="";
		for(int i =0;i<count+2;i++){
			list+=nums[i]+"";
		}
		return list;
	}
	
	public String toString(){
		return "It took " + count + " times";
	}
		
}