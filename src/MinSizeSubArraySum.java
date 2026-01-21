public class MinSizeSubArraySum {
    static int minimum(int[] arr, int target) {
        //very important sliding window  
        int low = 0;
        int n = arr.length - 1;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        for (int high = 0; high < n; high++) {
            sum = sum + arr[high];
            while (sum >= target) {
                int len = high - low + 1;
                res = Math.min(res, len);
                sum = sum - arr[low];
                low++;
            }
        }
//        return (res == Integer.MAX_VALUE) ? 0 : res;
        return res;


    }

    public static void main(String[] args) {

        int[] ar = {1, 2, 4, 4};
        int k = 4;
        System.out.println(minimum(ar, k));

    }
}
