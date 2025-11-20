public class MultplyBy2 {
    public static int findFinalValue(int[] nums, int original)
    {
        Set<Integer> numSet=new HashSet<>();
        for(int num:nums)
        {
            numSet.add(num);
        }
        while(numSet.contains(original))
        {
            original*=2;
        }
        return original;
    }
    public static void main(String[]args)
    {
        int[]arr={2,4,6,8,9,16,29,26,32};
        System.out.println(findFinalValue(arr,2));
    }

}
