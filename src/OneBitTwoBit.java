import java.util.*;
public class OneBitTwoBit {
    public static boolean isOneBitCharacter(int[] bits) {
        int i=0;
        int n=bits.length;
        while(i<n-1)
        {
            if(bits[i]==0)
                i++;
            else
                i+=2;

        }
        if(i==n-1)
            return true;
        return false;
    }
    public static void main(String[]args)
    {
        int[]nums={1,0,0};
        System.out.println(isOneBitCharacter(nums));

    }
}
