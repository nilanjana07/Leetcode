
//Problem link:https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/?envType=daily-question&envId=2025-11-04
import java.util.*;
public class XSumofAllKArrays {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int [] answer=new int[n-k+1];
        for(int i=0;i<answer.length;i++)
        {
            answer[i]=calsum(nums, i, i+k-1,x);
        }
        return answer;
    }
    public int calsum(int[]nums, int start, int end, int x)
    {
        int maxval=50;
        //creating a frequency array
        int[]freq=new int[maxval+1];
        //for edge cases we introduce a distinct count variable. This is to make sure that we atleast have x distinct numbers. If we dont, the that means we just need to prit the total sum
        int distinctCount=0;
        int totalSum=0;
        //the below loop will calculate the sum of distinct vals.
        //how this works is, freq[1] will contain the frequency of 1, freq[2] will contain freq 2 and so on.
        for(int i=start;i<=end;i++)
        {
            int num=nums[i];
            totalSum+=num;
            if(freq[num]==0)
            {
                distinctCount++;
            }
            freq[num]++;
        }
        if(distinctCount<x)
        {
            return totalSum;
        }
        int result=0;
        //now the below loop will allow us to select the top x.
        //Can we sort the array? No. [Frequency array]
        for(int select=0;select<x;select++)
        {
            int bestNumber=-1;
            int bestFreq=-1;
            for(int i=maxval;i>=1;i--)
            {
                if(freq[i]>bestFreq)
                {
                    bestFreq=freq[i];
                    bestNumber=i;
                }
            }
            if(bestNumber!=-1)
            {
                result+=bestNumber*bestFreq;
                freq[bestNumber]=0;
            }

        }
        return result;
    }
    public static void main(String[] args)
    {
        XSumofAllKArrays obj=new XSumofAllKArrays();
        int[]input={1,1,2,2,3,4,2,3};
        int[]result=obj.findXSum(input,6,2);
        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
