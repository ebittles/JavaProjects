import java.text.DecimalFormat;

public class TicketClass {
	private double weight, cost;
	String description;
	
	DecimalFormat output = new DecimalFormat("$0.00");
	
	public TicketClass(String d, double w, double c){
		description = d;
		weight = w;
		cost = c;
	}
	public double total(){
		return cost*weight;
	}
	public String toString(){
		String chart;
		String border = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
		chart = "Penny Spender Supermakret Produce Debartment \n\n ITEM \t Weight \t Cost/lb \tCOST \n\n"
		+ description + "\t " + weight + "lb \t" + output.format(cost) + "\t \t" + output.format(total());
		return border + "\n\n" + chart + "\n\n" + "\n\t\tThank You!\n" + border + "\n";
	}
}