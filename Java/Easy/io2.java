import java.util.*;

public class io2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = sobj.nextInt();
        double dNo = sobj.nextDouble();

        sobj.nextLine();

        String str = sobj.nextLine();

        System.out.println("String : " + str);
        System.out.println("Double : " + dNo);
        System.out.println("int : " + iNo);

        sobj.close();
    }
}