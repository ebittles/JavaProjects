import java.text.DecimalFormat;

public class DiceRoll{
	private int numRolls;
	private int s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
	private double p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
	private String nums = "";
	
	DecimalFormat d = new DecimalFormat("0.000%");
	
	public DiceRoll(int n){
		numRolls = n;
		
		s2=s3=s4=s5=s6=s7=s8=s9=s10=s11=s12=0;
	}
	
	public void rollDice(){
		for(int i=1;i<=numRolls;i++){
			int result = (int) ((Math.random()*6)+1)+ (int)((Math.random()*6)+1);
			nums = nums + result + "   ";
			
			switch(result){
				case 2: s2++;
				break;
				case 3: s3++;
				break;
				case 4: s4++;
				break;
				case 5: s5++;
				break;
				case 6: s6++;
				break;
				case 7: s7++;
				break;
				case 8: s8++;
				break;
				case 9: s9++;
				break;
				case 10: s10++;
				break;
				case 11: s11++;
				break;
				case 12: s12++;
				break;
			}
			
			p2 = (double) s2/numRolls;
			p3 = (double) s3/numRolls;
			p4 = (double) s4/numRolls;
			p5 = (double) s5/numRolls;
			p6 = (double) s6/numRolls;
			p7 = (double) s7/numRolls;
			p8 = (double) s8/numRolls;
			p9 = (double) s9/numRolls;
			p10 = (double) s10/numRolls;
			p11 = (double) s11/numRolls;
			p12 = (double) s12/numRolls;
			
		}
	}
	
	public String getNums(){
		return nums;
	}
	
	public String toString(){
		return "NUMBER \t\t\t FREQUENCY \t\t PERCENTAGE\n"
				+ "2 \t\t\t " + s2 + " \t\t\t " + d.format(p2) + "\n"
				+ "3 \t\t\t " + s3 + " \t\t\t " + d.format(p3) + "\n"
				+ "4 \t\t\t " + s4 + " \t\t\t " + d.format(p4) + "\n"
				+ "5 \t\t\t " + s5 + " \t\t\t " + d.format(p5) + "\n"
				+ "6 \t\t\t " + s6 + " \t\t\t " + d.format(p6) + "\n"
				+ "7 \t\t\t " + s7 + " \t\t\t " + d.format(p7) + "\n"
				+ "8 \t\t\t " + s8 + " \t\t\t " + d.format(p8) + "\n"
				+ "9 \t\t\t " + s9 + " \t\t\t " + d.format(p9) + "\n"
				+ "10 \t\t\t " + s10 + " \t\t\t " + d.format(p10) + "\n"
				+ "11 \t\t\t " + s11 + " \t\t\t " + d.format(p11) + "\n"
				+ "12 \t\t\t " + s12 + " \t\t\t " + d.format(p12) + "\n";
	}
}