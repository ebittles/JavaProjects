import java.text.DecimalFormat;

public class DiceRoll2{
	private int numRolls;
	private int sums[] = new int[11];
	private double p[] = new double[11];
	private int total[];
	
	private DecimalFormat d = new DecimalFormat("0.000%");
	
	public DiceRoll2(int n){
		numRolls = n;
		total = new int[numRolls];
	}
	
	public void rollDice(){
		for(int i=0;i<numRolls;i++){
			int result = (int) ((Math.random()*6)+1)+ (int)((Math.random()*6)+1);
			sums[result-2]++;
			total[i] = result;
		}
		
		for(int i=0;i<11;i++){
			p[i] = (double) sums[i]/numRolls;
		}
	}
	
	public String getNums(){
		String list = "";
		for(int i=0;i<numRolls;i++){
			list += total[i] + "\t";
		}
		return list;
	}
	
	public String toString(){
		return "NUMBER \t\t\t FREQUENCY \t\t PERCENTAGE\n"
				+ "2 \t\t\t " + sums[0] + " \t\t\t " + d.format(p[0]) + "\n"
				+ "3 \t\t\t " + sums[1] + " \t\t\t " + d.format(p[1]) + "\n"
				+ "4 \t\t\t " + sums[2] + " \t\t\t " + d.format(p[2]) + "\n"
				+ "5 \t\t\t " + sums[3] + " \t\t\t " + d.format(p[3]) + "\n"
				+ "6 \t\t\t " + sums[4] + " \t\t\t " + d.format(p[4]) + "\n"
				+ "7 \t\t\t " + sums[5] + " \t\t\t " + d.format(p[5]) + "\n"
				+ "8 \t\t\t " + sums[6] + " \t\t\t " + d.format(p[6]) + "\n"
				+ "9 \t\t\t " + sums[7] + " \t\t\t " + d.format(p[7]) + "\n"
				+ "10 \t\t\t " + sums[8] + " \t\t\t " + d.format(p[8]) + "\n"
				+ "11 \t\t\t " + sums[9] + " \t\t\t " + d.format(p[9]) + "\n"
				+ "12 \t\t\t " + sums[10] + " \t\t\t " + d.format(p[10]) + "\n";
	}
}