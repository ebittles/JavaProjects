import java.util.Random;

public class SlotsClass{
	private String[] w1 = {"Cherry","Cherry","Cherry","Plum","Plum","Bell","Bar"};
	private String[] w2 = {"Cherry","Cherry","Plum","Plum","Plum","Bell","Bar"};
	private String[] w3 = {"Cherry","Cherry","Plum","Plum","Bell","Bell","Bar"};
	private String[] output = new String[3];
	private int coins = 5;
	
	Random r = new Random();
	
	public String play(){
		coins--;
		String out = "";
		int i1 = r.nextInt(w1.length);
		String r1 = w1[i1];
		output[0] = r1;
		int i2 = r.nextInt(w2.length);
		String r2 = w2[i2];
		output[1] = r2;
		int i3 = r.nextInt(w3.length);
		String r3 = w3[i3];
		output[2] = r3;
		System.out.println(output);
		out += r1 + " | " + r2 + " | " + r3;
		return out;
	}
	
	public String toString(){
		String out = "";
		switch(output[0]){
			case "Plum":
				if(output[1].equals("Plum")){
					if(output[2].equals("Plum")){
						coins+=20;
						out+="You win 20 coins!";
						break;
					}
					coins+=4;
					out+="You win 4 coins!";
					break;
				}
				coins+=2;
				out+="You win 2 coins!";
				break;
			case "Bell":
				if(output[1].equals("Bell")){
					if(output[2].equals("Bell")){
						coins+=100;
						out+="You win 100 coins!";
						break;
					}
					coins+=8;
					out+="You win 8 coins!";
					break;
				}
				coins+=4;
				out+="You win 4 coins!";
				break;
			case "Bar":
				if(output[1].equals("Bar")){
					if(output[2].equals("Bar")){
						coins+=200;
						out+="You win 200 coins!";
						break;
					}
					coins+=8;
					out+="You win 8 coins!";
					break;
				}
				coins+=4;
				out+="You win 4 coins!";
				break;
			default:
				out+="You win 0 coins!";	
		}
		out += "\nYou have " + coins + " coins left.";
		return out;
	}
}