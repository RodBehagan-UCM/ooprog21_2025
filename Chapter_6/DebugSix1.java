// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;
class DebugSix1
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 1;
      System.out.print("Enter number of days >> "); //added semicolon
      days = keyboard.nextInt();
      while(days >= day) //changed '<' to '>='
      {
         money = 2 * money;
         System.out.println("After day " + day +
            " you have " + money);
         ++day; //moved here
      }
   }

}
