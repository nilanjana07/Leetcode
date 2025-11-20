import java.util.*;
public class SetIntersection {
    public static int intersectionSizeTwo(int[][] intervals) {
        //2D array sorting
        //Here we are using a Greedy approach to sort.
        //Here a represents the first row to compare and b represents the 2nd row.
        //If the interval end is the same, then we sort on the basis og the interval start
        Arrays.sort(intervals,(a,b)->{
            if(a[1]==b[1])
            {
                return b[0]-a[0];
            }
            return a[1]-b[1];});
        List<Integer> nums=new ArrayList<>();
        int count=0;
        for(int[]interval:intervals)
        {
            int start=interval[0];
            int end=interval[1];
            int c=0;
            for(int i=nums.size()-1; i>=0; i--)
            {
                if(nums.get(i)>=start && nums.get(i)<=end){
                    c++;
                    if(c==2)
                        break;
                }
            }
            if(c==0)
            {
                nums.add(end-1);
                nums.add(end);
                count+=2;
            }
            else if(c==1){
                nums.add(end);
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[][]intervals={{2,3},{2,4},{5,9},{6,7}};
        System.out.println(intersectionSizeTwo(intervals));
    }
}
