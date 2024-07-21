public class ScoreWeightClass {
	
	private int test1,test2,test3;
	
	public final double Weight1 = .3;
	public final double Weight2 = .25;
	public final double Weight3 = .45;
	
	
	public ScoreWeightClass(int t1, int t2, int t3){
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}
	
	public double weightOne(){
		return test1*Weight1;
	}
	public double weightTwo(){
		return test2*Weight2;
	}
	public double weightThree(){
		return test3*Weight3;
	}
	
	public double sum(){
		return(weightOne()+weightTwo()+weightThree());
	}	
}