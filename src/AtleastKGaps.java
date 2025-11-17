import java.util.*;
public class AtleastKGaps {
    public static boolean kLengthApart(int[] nums, int k) {
        int lastpos=-100000;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                if(i-lastpos-1<k)
                {
                    return false;
                }
                lastpos=i;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        int[]nums={1,0,0,0,1,0,0,1};
        int k=2;
        System.out.println(kLengthApart(nums,k));
    }
}
