import javax.swing.JOptionPane;

public class Pi {
	public static void main(String [] args){
		String ittr = JOptionPane.showInputDialog("Enter number of iterations:", 0);
		
		if (ittr != null){
			int num = Integer.parseInt(ittr);
			double apprx = 0;
			
			for(int i=1; i<=num; i++){
				apprx = apprx + (1.0/(i*2-1)) * Math.pow(-1, i-1);
			}
			JOptionPane.showMessageDialog(null, 
				String.format("Approximated pi with %s iterations: %,.16f", num, apprx*4));
			System.out.println(apprx*4);
		}
		
		
	}
}