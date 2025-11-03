import java.util.*;
public class LongestSubstring {
    //The idea is to find the longest substring without any duplicate characters

    public int longestSubstring(String s)
    {
        int n=s.length();
        int maxlen=0;
        Set<Character> charSet= new HashSet<>();
        int left=0;
        for(int right=0;right<n;right++)
        {
            if(!charSet.contains(s.charAt(right)))
            {
                charSet.add(s.charAt(right));
                maxlen= Math.max(maxlen, right-left+1);
            }
            else
            {
                while(charSet.contains(s.charAt(right)))
                {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxlen;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        LongestSubstring ob=new LongestSubstring();
        System.out.println(ob.longestSubstring(s));

    }
}


