import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter initial bank balance: ");
        double balance, rate;
        double initial = input.nextDouble();
        double[] rates = {0.02, 0.03, 0.04, 0.05};
        
        for (int i = 0; i < rates.length; i++) {
            rate = rates[i];
            balance = initial;
            
            System.out.println("\nWith an initial balance of " + initial + " at an interest rate of " + rate);
            
            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * rate);
                System.out.println("after year " + year + " balance is " + balance);
           
            }
        }
    }
}