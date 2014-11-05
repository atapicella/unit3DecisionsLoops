
public class NestedLoops
{
    public static void main(String[] args)
    {
        int i = 1;
        int j = 1;
        do
        {
            if (j == 5)
            {
                j = 1;
            }
            do 
            {
                System.out.print(i + " " + j+ "\n");
                j++;
            }while (j<5);
            i++;
        }while (i<3);
    }


}
