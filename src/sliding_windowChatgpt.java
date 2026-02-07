import java.util.Arrays;

public class sliding_windowChatgpt {
    static long []  firstNegative(int[] arr, int k) {

        int n= arr.length;;
//        int [] r = new int[n-k+1];
//        int p = 0;
//        int com = 0;
//
//        for (int i=0; i<=n-k ;i++)
//        {
//            for (int j= i;j<i+k;j++)
//            {
//                if (arr[j]<0)
//                {
//                    com = arr[j];
//                    break;
//
//                }
//            }
//            r[p++] = com;
//
//        }
//
//
//        return r;
        long[] ans = new long[n - k + 1];
        int idx = 0;

        for (int i = 0; i <= n - k; i++) {

            long firstNeg = 0;

            // scan inside the window [i ... i+k-1]
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    firstNeg = arr[j];
                    break;
                }
            }

            ans[idx++] = firstNeg;
        }

        return ans;
    }


    public static void main(String[] args) {
        int arr[]= {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(Arrays.toString(firstNegative(arr, k)));

    }
}
