import java.util.*;
public class DivBy3 {
    public static int minimumOperations(int[] nums) {
        int count=0;
        for (int num:nums)
        {
            if(num%3 !=0 )
                count++;
        }
        return count;

    }
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4};
        System.out.println(minimumOperations(arr));
    }

}
