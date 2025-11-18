import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numIndex=new HashMap<>();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            int dif=target-nums[i];
            if(numIndex.containsKey(dif))
            {
                return new int[]{i,numIndex.get(dif)};
            }
            numIndex.put(nums[i],i);
        }
        return null;

    }
    public static void main(String[]args)
    {
        int[]nums={2,3,4,5,6};
        System.out.println(twoSum(nums,10));
    }
}
