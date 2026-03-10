import java.util.*;

class loop2
{
    public static void main(String []argh)
    {
        Scanner sobj = new Scanner(System.in);

        int no = sobj.nextInt();

        if (no <= 0 || no >= 500) 
        {
            sobj.close();
            return;
        }

        int a = 0, b = 0, n = 0;

        for(int i = 0; i < no; i++)
        {
            a = sobj.nextInt();
            b = sobj.nextInt();
            n = sobj.nextInt();

            if ((a < 0 || a >= 50) || (b < 0 || b >= 50) || (n < 1 || n > 15))
            {
                continue;
            }

            int Ans = a;
            int x = 1;

            for (int j = 1; j <= n ; j++)
            {
                Ans = Ans + (x * b);
                x = x * 2;
                
                System.out.print(Ans + " ");
            }

            System.out.println();
        }

        sobj.close();
    }
} 
