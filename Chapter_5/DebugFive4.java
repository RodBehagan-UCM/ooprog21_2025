// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
public class DebugFive4
{
   public static void main (String[] args) 
   {
      int one, two, three, four;
      int highest;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      one = input.nextInt();
      System.out.print("Enter an integer >> ");
      two = input.nextInt(); //changed to 'two'
      System.out.print("Enter an integer >> ");
      three = input.nextInt(); //changed to 'three'
      System.out.print("Enter an integer >> ");
      four = input.nextInt();//changed to 'four'
      
     if (one >= two && one >= three && one >= four) { //Added { } and used '>=' so ties count too
         highest = one;
      }
      else if(two >= one && two >= three && two >= four) { //change || to &&
         highest = two;
      }
      else if(three >= one && three >= two && three >= four) { //change == to >
         highest = three;
      }
      else {
         highest = four;
      }
      
      System.out.println("The highest number is " + highest);
   }
}
