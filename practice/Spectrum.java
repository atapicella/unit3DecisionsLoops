import java.util.Scanner;
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double val;
        System.out.println("Enter a wavelength value");
        val = scan.nextDouble();
        if (val > Math.pow(10, -1))
        {  
            System.out.println("Type: Gamma ray");
        }
        else if (val < Math.pow(10, -3))
        {  
            System.out.println("Type: Gamma ray");
        }
        else if (val < 7*(Math.pow(10, -7)))
        {
            System.out.println("Type: Gamma ray");
        }
        else if (val < 4*(Math.pow(10, -7)))
        {
            System.out.println("Type: Gamma ray");
        }
        else if (val < Math.pow(10, -8))
        {
            System.out.println("Type: Gamma ray");
        }
        else if (val < Math.pow(10, -11))
        {
            System.out.println("Type: Gamma ray");
        }
        else if (val < Math.pow(10, -11))
        {
            System.out.println("Type: Gamma ray");
        }
    }
              
}

