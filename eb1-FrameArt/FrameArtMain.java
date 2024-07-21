import java.util.*;
import java.text.DecimalFormat;

public class FrameArtMain {
	public static void main(String [] args){
		
		Scanner reader = new Scanner(System.in);
		
		double length,width;
		
		System.out.print("\nEnter lenghth of art (in): ");
		length = reader.nextDouble();
		System.out.print("\nEnter width of art (in): ");
		width = reader.nextDouble();
		
		FrameArtClass c = new FrameArtClass(length, width);
		DecimalFormat output = new DecimalFormat("$0.00");
		
		System.out.println("\nThe area of the art is " + c.findArea() + "in squared");
		System.out.println("The perimeter of the art is " + c.findPerimeter() + "in");
		
		System.out.println("\nThe cost of glass is is " + output.format(c.glassPrice()));
		System.out.println("The frame cost is " + output.format(c.framePrice()));
		System.out.println("The total cost is " + output.format(c.totalPrice()));
	} 
}