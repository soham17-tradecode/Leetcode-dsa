import java.util.Arrays;

public class p1 {
    static  int []  twoSum (int [] arr ,int target)
    {
        int n = arr.length;
        int [] r = new int[arr.length];
        for (int i=0 ;i<n;i++)
        {
            for (int j=i+1 ; j<n ;j++)
            {
                if (arr[i] + arr[j]== target)
                {
                   r = new int[] {arr[i],arr[j]}  ;
                }
            }
        }
        return  r;
    }


    public static void main(String[] args) {
        int [] arr = {0,-1,2,-3,1};
        int target = -2;


        System.out.println(Arrays.toString(twoSum(arr, target)));

    }
}
