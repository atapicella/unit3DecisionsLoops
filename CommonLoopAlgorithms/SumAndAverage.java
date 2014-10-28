import java.util.Scanner;
public class SumAndAverage
{
    /**
     * Computes the sum and average of the specified series of numbers.
     */
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a series of numbers, type 'q' to exit");
       
       double total = 0;
       int count = 0;
       
       while (scan.hasNextDouble())
       {
           double value = scan.nextDouble();
           total += value;
           count++;
           
        }
       double average = 0;
       if (count > 0)
       {
           average= total/count;
        }
        System.out.println("Total: " + total + "\nAverage: " + average);
    }
}