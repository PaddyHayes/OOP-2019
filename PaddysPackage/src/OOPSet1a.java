import javax.swing.*;
public class OOPSet1a {
    public static void main(String args[]){

        String amountAsString;
        String rateAsString;
        double rate=0;
        double amount=0;

        System.out.println("History");


        do {
            amountAsString = JOptionPane.showInputDialog(null, "Please enter the amount");
            if (!amountAsString.equals("0")) {
                amount = Double.parseDouble(amountAsString);
                rateAsString = JOptionPane.showInputDialog(null, "Please enter the exchange rate");
                rate = Float.parseFloat(rateAsString);
                System.out.printf("Answer %.2f\n", rate * amount);
            }
        } while(!amountAsString.equals("0"));

    }
}
