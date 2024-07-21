public class TrainClass{
	private int a,b,c;
	private int[][] distance = {{0,171,115,141,240},
								{171,0,103,194,333},
								{115,103,0,120,235},
								{141,194,120,0,104},
								{240,333,235,104,0}};
	
	public TrainClass(int a1, int b1, int c1){
		a=a1;
		b=b1;
		c=c1;
	}
	
	public int distance(){
		int d;
		if(c==0){
			d = distance[a-1][b-1];
			return d;
		}else{
			d = distance[a-1][c-1] + distance[c-1][b-1];
		}
		return d;
	}
	
	public String toString(){
		return "Total distance: " + distance() + " miles";
	}
}