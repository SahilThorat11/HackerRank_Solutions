import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int lineNumber = 1;

        while (sobj.hasNextLine()) 
        {
            String line = sobj.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        sobj.close();
    }
}