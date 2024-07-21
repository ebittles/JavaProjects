import java.util.*;

public class InterestMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean again = true;

        do {
            System.out.println("Select one of the following choices");
            System.out.println("\t[A]  Compute monthly mortgage payment");
            System.out.println("\t[B]  Display amortization schedule");
            System.out.println();
            System.out.print("Enter your choice ===>> ");
            String choice = s.next().toUpperCase();

            System.out.print("\n\n");
            System.out.println("Enter Interest Rate: ");
            double rate = s.nextDouble();
            System.out.println("Enter Principal: ");
            double principal = s.nextDouble();
            System.out.println("Enter Number of Years: ");
            int years = s.nextInt();

            InterestClass i = new InterestClass(rate, principal, years);
            i.payment();

            if (choice.equals("B")) {
                System.out.println(i);
                System.out.println();
                System.out.println("The amount you paid in interest was " + i.getTotalInterest());
            } else {
                System.out.println("The monthly mortgage payment is " + i.getMonthlyPayment());
            }

            System.out.print("\nWould you like to try again? Y/N ");
            String input = s.next().toUpperCase();
            if (!input.equals("Y")) {
                again = false;
            }
            System.out.print("\n\n");
        } while (again);
    }
}
