import java.util.Arrays;

public class slidingWindowSum {
    //important sliding window pattern
    static int  SlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = k - 1;
        int sum = 0;
        int res = 0;
        for (int i = low; i <= high; i++) {
            sum = sum + arr[i];
        }

        while (high < n) {
            res = Math.max(res, sum);
            low++;
            high++;

            if (high == n) {
                break;
            }
            sum = sum - arr[low - 1];


            sum = sum+arr[high];
        }
        return res;


//        int [] s1 = new int[arr.length-1];
//        for (int i=0 ;i< n-1; i++)
//        {
//            s1[i] = arr[i]+arr[i+1];
//
//        }
//        for (int i=0;i<s1.length-1;i++)
//        {
//            if (s1[i]>s1[i+1])
//            {
//                System.out.println(s1[i]);
//            }
//        }

    }

    public static void main(String[] args) {
        int[] ar = {100, 200, 300, 400};
        int k = 2;
        System.out.println(Arrays.toString(new int[]{SlidingWindow(ar, k)}));

//        SlidingWindow(ar, k);

    }
}
