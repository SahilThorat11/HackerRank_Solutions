import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("================================");

        for(int i = 0; i < 3; i++) 
        {
            String str = sobj.next();
            int x = sobj.nextInt();

            System.out.printf("%-15s%03d\n", str, x);
        }

        System.out.println("================================");

        sobj.close();
    }
}