import java.util.*;

class dataTypes
{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x>=-128 && x<=127)
                {
                    System.out.println("* byte");
                }
                if(x>=-32768 && x<=32767)
                {
                    System.out.println("* short");
                }
                if(x>=-2147483648 && x<=2147483647)
                {
                    System.out.println("* int");
                }
                
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

        sc.close();
    }
}


////////////////////////////////////////////////////////////////
//
//              TEST CASES SUCCESSFULL
//
////////////////////////////////////////////////////////////////

/*

0 can be fitted in:
* byte
* short
* int
* long

1 can be fitted in:
* byte
* short
* int
* long

-1 can be fitted in:
* byte
* short
* int
* long

18446744073709551616 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
18446744073709551615 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.

32768 can be fitted in:
* int
* long

-32768 can be fitted in:
* short
* int
* long

32767 can be fitted in:
* short
* int
* long

-32767 can be fitted in:
* short
* int
* long

2147483648 can be fitted in:
* long

2147483647 can be fitted in:
* int
* long

-2147483648 can be fitted in:
* int
* long

-2147483647 can be fitted in:
* int
* long

128 can be fitted in:
* short
* int
* long

127 can be fitted in:
* byte
* short
* int
* long

-128 can be fitted in:
* byte
* short
* int
* long

-127 can be fitted in:
* byte
* short
* int
* long

123123123333333333333333333333333313123123 can't be fitted anywhere.
234444444444444444444444444444444444444 can't be fitted anywhere.

-1222222 can be fitted in:
* int
* long

11110000000 can be fitted in:
* long

*/