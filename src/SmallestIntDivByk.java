import java.util.*;
public class SmallestIntDivByk {
    public static int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0)
            return -1;
        if(k==1)
            return 1;
        int rem=0;
        for(int i=1;i<=k;i++)
        {
            rem=(rem*10+1)%k;
            System.out.println("For i=" +i+"Remainder ="+rem);
            if(rem==0)
                return i;
        }
        return -1;
    }

    public static void main(String[]args)
    {
        System.out.println(smallestRepunitDivByK(3));
    }
}
