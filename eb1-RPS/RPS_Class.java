import java.util.*;

public class RPS_Class{
	private int wins,losses,ties = 0;
	private Random r = new Random();
	
	public String playGame(String a){
		int num = r.nextInt(3)+1;
		if(num==1){
			if(a.equals("R")){
				ties++;
				return "You tied!";
			}
			if(a.equals("P")){
				wins++;
				return "You won!";
			}
			if(a.equals("S")){
				losses++;
				return "You lost!";
			}
		}
		if(num==2){
			if(a.equals("R")){
				losses++;
				return "You lost!";
			}
			if(a.equals("P")){
				ties++;
				return "You tied!";
			}
			if(a.equals("S")){
				wins++;
				return "You won!";
			}
		}
		if(num==3){
			if(a.equals("R")){
				wins++;
				return "You won!";
			}
			if(a.equals("P")){
				losses++;
				return "You lost!";
			}
			if(a.equals("S")){
				ties++;
				return "You tied!";
			}
		}
		return "FUCK";
	}
	
	public String toString(){
		return "\nWins: " + wins + "\n" + "Losses: " + losses + "\n" + "Ties: " + ties + "\n";
	}
}