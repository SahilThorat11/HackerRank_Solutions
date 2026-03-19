import java.io.*;
import java.util.*;

public class Solution 
{

    // Function to check palindrome
    public static boolean isPalindrome(String s) 
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) 
        {
            if (s.charAt(left) != s.charAt(right)) 
            {
                return false; // mismatch
            }
            left++;
            right--;
        }
        return true; // all matched
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        boolean bFlag = false;
        String str = sobj.next(); // read input

        bFlag = isPalindrome(str);

        if(bFlag == true)
        {
            System.out.println("Yes");
        } 
        else 
        {
            System.out.println("No");
        }

        sobj.close();
    }
}