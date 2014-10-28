import java.util.Scanner;
public class Epsilon{
    
    public static void main(String[] args0)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a float: ");
        float num;
        num = scan.nextFloat();
        if (num == 0)
        {
            System.out.println("Zero");
        }
        else if (num > 0)
        {
            System.out.println("Positive");
        }
        else if (num < 0)
        {
            System.out.println("Negative");
        }
        if (Math.abs(num)<1)
        {
            System.out.println("Small");
        }
        if (Math.abs(num)>1000000)
        {
            System.out.println("Large");
        }
            
    }
    
    
    
    
    
    
    
}