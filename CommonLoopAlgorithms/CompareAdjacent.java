import java.util.Scanner;

public class CompareAdjacent
{
    /**
     * Detects duplicate adjacent numbers in the specific series of numbers
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit)");
        
        double prevValue = scan.nextDouble();
        
        while (scan.hasNextDouble())
        {
            double value = scan.nextDouble();
            if (value == prevValue)
            {
                System.out.println("Duplicate number!");
            }
            prevValue = value;
        }
    }
}