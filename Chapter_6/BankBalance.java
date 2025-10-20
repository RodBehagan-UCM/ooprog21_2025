import java.util.Scanner;

public class BankBalance
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double rate = 0.03;
        double amount;
        int year = 1;

        System.out.print("enter initial bank balance: ");
        amount = scan.nextDouble();
       
        System.out.print("do you want to see next year's balance?\n");
        System.out.print("enter 1 for yes or any other number for no: ");
        int choice = scan.nextInt();

        while (choice == 1)
        {
            amount = amount + (amount * rate);
            System.out.printf("after year %d at %.2f interest rate, balance is $%.1f%n", year, rate, amount);

            System.out.print("\nDo you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes or any other number for no: ");
            choice = scan.nextInt();

            year++;
        }
    }
}