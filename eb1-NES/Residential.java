public class Residential{
	
	private double t = 0;
	
	public Residential(double w){
		if(w<=75){
			t = w * 0.03907;
		}else if(w<=225&&w>75){
			t = 75*0.03907 + (w-75)*0.02757;
		}else if(w<=500&&w>225){
			t = 75*0.03907 + 150*0.02757 + (w-225)*0.01537;
		}else{
			t = 75*0.03907 + 150*0.02757 + 275*0.01537 + (w-500)*0.01177;
		}
		
		if(t<1.25)
		{
			t = 1.25;
		}
	}
	
	public double getTotal(){
		return t;
	}
}