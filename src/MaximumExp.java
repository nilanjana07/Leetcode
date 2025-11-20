public class MaximumExp {
        public static int maximizeExpressionOfThree(int[] nums) {
            Arrays.sort(nums);
            return(nums[nums.length-1]+nums[nums.length-2]-nums[0]);
        }
        public static void main(String[]args)
        {
            int[]nums={2,3,12,67,-9};
            System.out.println(maximizeExpressionOfThree(nums));
        }

    }

