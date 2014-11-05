import java.util.Scanner;

public class NumericalMethods
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter an integer for n: ");
       int n = scan.nextInt();       
       
       int a = 0;
       int b = 1;
       int newB = 0;
       for (int i = 1;i<n;i++)
       {
          newB = a+b;
          a = b;
          b = newB;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + b);
    }
   }
