import java.util.Arrays;

public class leetCode724 {

    static int pivot(int [] nums )
    {
        int sum = 0 ;
        int index=0;
        for (int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int left = 0,right;
        for (int i=0;i<nums.length;i++)
        {

            right =  sum- left- nums[i] ;
            if (left == right)
            {
               return i;
            }
            left += nums[i];
        }
        return -1;



    }
    static int [] pre(int [] arr)
    {
        int [] prefix = new int[arr.length];

        for (int i=1;i<arr.length;i++)
        {
            prefix[i] = prefix[i-1]+ arr[i-1];
        }
        return prefix;
    }
    static int [] suff (int [] arr)
    {
        int [] suffix = new int[arr.length];

        for (int i=arr.length-2;i>=0;i--)
        {
            suffix[i] = arr[i] + suffix[i+1];
        }
        return suffix;
    }


    public static void main(String[] args) {

        int [] o = {1,2,3};
        int k = 2;
//        System.out.println(o.length);
//        System.out.println(subArray(o,k));
//        System.out.println(Arrays.toString(pre(o)));
//        System.out.println(Arrays.toString(suff(o)));
        System.out.println(pivot(o));
    }
}
