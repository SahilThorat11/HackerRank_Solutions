import java.util.*;

public class io
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = sobj.nextInt();
        int iNo2 = sobj.nextInt();
        int iNo3 = sobj.nextInt();

        System.out.println(iNo1);
        System.out.println(iNo2);
        System.out.println(iNo3);

        sobj.close();
    }
}