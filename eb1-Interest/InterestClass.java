import java.text.*;

public class InterestClass {
    private DecimalFormat d = new DecimalFormat("$0.00");
    private double rate;
    private double principal;
    private int years;
    private double monthlyPayment;
    private double totalInterest = 0.0;

    public InterestClass(double r, double p, int t) {
        rate = r;
        principal = p;
        years = t;
    }

    public double payment() {
        rate /= 12;
        monthlyPayment = (((rate / 100) * Math.pow((1 + (rate / 100)), (12.0 * years))) /
                ((Math.pow((1 + (rate / 100)), (12.0 * years))) - 1)) * principal;
        return monthlyPayment;
    }

    public String getMonthlyPayment() {
        return d.format(monthlyPayment);
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        double interestPayment;

        display.append("PAYMENT\t\t\tMONTHLY\t\t\tINTEREST\t\tPRINCIPAL\t\tPRINCIPAL\n")
                .append("NUMBER \t\t\tPAYMENT\t\t\tPAYMENT \t\tPAYMENT  \t\tBALANCE  \n");

        for (int i = 1; i <= years * 12; i++) {
            interestPayment = principal * (rate / 100);
            totalInterest += interestPayment;
            double principalPayment;
            String prefix = (i > 99) ? "    \t\t\t" : ((i > 9) ? "     \t\t\t" : "       \t\t");

            display.append(prefix)
                    .append(d.format(monthlyPayment)).append("\t\t\t")
                    .append(d.format(interestPayment)).append("\t\t\t");

            principalPayment = monthlyPayment - interestPayment;
            display.append(d.format(principalPayment)).append("\t\t\t");
            principal -= principalPayment;
            display.append(d.format(principal)).append("  \n");
        }

        display.append(years * 12 + 1).append("\t\t\t").append(d.format(principal)).append("\t\t\t")
                .append("$0.00").append("\t\t\t").append("$0.00").append("\t\t\t").append("$0.00");

        return display.toString();
    }

    public String getTotalInterest() {
        return d.format(totalInterest);
    }
}
