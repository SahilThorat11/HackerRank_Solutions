import java.util.*;

public class Solution {

    public static boolean isAnagram(String a, String b) 
    {
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] freq = new int[26];

        for (int i = 0; i < a.length(); i++) 
        {
            freq[a.charAt(i) - 'a']++; 
            freq[b.charAt(i) - 'a']--; 
        }

        for (int count : freq) 
        {
            if (count != 0) 
            {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        if (isAnagram(a, b)) 
        {
            System.out.println("Anagrams");
        } 
        else 
        {
            System.out.println("Not Anagrams");
        }
    }
}