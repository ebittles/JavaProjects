import java.text.DecimalFormat;

public class qbrClass{
	private String name;
	private int attempts, completions, yardsGained, tds, interceptions;
	DecimalFormat d = new DecimalFormat("#.##");
	DecimalFormat t = new DecimalFormat("#.#");
	
	public qbrClass(String n, int a, int c, int y, int t, int i){
		name = n;
		attempts = a;
		completions = c;
		yardsGained = y;
		tds = t;
		interceptions = i;
	}
	
	private double percent_completions(){
		double p = ((double)completions/attempts*100 - 30)*.05;
		if(p>=2.375){
			return 2.375;
		}
		if(p<0){
			return 0.00;
		}
		return p;
	}
	
	private double avg_yds(){
		double p = ((double)yardsGained/attempts - 3)*.25;
		if(p>=2.375){
			return 2.375;
		}
		if(p<0){
			return 0.00;
		}
		return p;
	}
	
	private double percent_td(){
		double p = ((double)tds/attempts*100)*.2;
		if(p>=2.375){
			return 2.375;
		}
		if(p<0){
			return 0.00;
		}
		return p;
	}
	
	private double percent_i(){
		double p = 2.375 - (((double)interceptions/attempts*100)*.25);
		if(p>=2.375){
			return 2.375;
		}
		if(p<0){
			return 0.00;
		}
		return p;
	}
	
	public String toString(){
		double totalP = (percent_completions()+avg_yds()+percent_td()+percent_i())/6*100;
		return name + " QBR: " + t.format(totalP);
	}
}