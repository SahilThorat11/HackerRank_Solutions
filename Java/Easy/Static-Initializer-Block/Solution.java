import java.util.*;

public class Solution 
{
    static int B;
    static int H;
    static boolean flag = true;

    static 
    {
        Scanner sobj = new Scanner(System.in);
        B = sobj.nextInt();
        H = sobj.nextInt();

        try 
        {
            if (B <= 0 || H <= 0) 
            {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } 
        catch (Exception eobj) 
        {
            System.out.println(eobj.toString());
        }
    }

    public static void main(String[] args) 
    {
        if (flag) 
        {
            int area = B * H;
            System.out.println(area);
        }
    }
}