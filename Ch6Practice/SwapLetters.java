import java.util.Scanner;
import java.util.Random;
public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        System.out.println();
        Random generator = new Random();
        int i = generator.nextInt(word.length()-1);
        int j = generator.nextInt(word.length()-1);
        
        for ( ;i>=j;)
        {
            j = generator.nextInt(word.length()-1);
        }
        String first = word.substring(0,i);
        String middle = word.substring(i+1,j);
        String last = word.substring(j+1,word.length());
        for (int k = 1; k<=word.length();k++)
        {
            System.out.println(word);        
        }
        System.out.println("\n" + first + word.charAt(j) + middle + word.charAt(i) + last + "\n");
     }
}
