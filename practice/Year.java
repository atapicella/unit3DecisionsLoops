import java.util.Scanner;
public class Year
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = scan.nextInt();
        isLeapYear(year);
    }
    public static void isLeapYear(int year)
    {
        if (year%4 == 0)
        {
            if (year%100 == 0)
            {
                 System.out.println(year + " is not a leap year");
            }
            else
            {
            System.out.println(year + " is a leap year");
        }
        }   
        else
        {
            System.out.println(year + " is not a leap year");
        }
    
        
    }

}
