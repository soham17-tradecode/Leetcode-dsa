public class MinSizeSubArraySum {
    static int minimum(int[] arr, int target) {
        //very important sliding window  
        int low = 0;
        int n = arr.length ;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        for (int high = 0; high < n; high++) {
            sum +=  arr[high];
            while (sum >= target) {
                if( high - low+1 < res)
                {
                    res = high - low+1;
                }
                sum -=  arr[low];
                low++;
            }
        }
        return res != Integer.MAX_VALUE ? res : 0;
//        return res ;


    }

    public static void main(String[] args) {

        int[] ar = {2,3,1,2,4,3};
        int k = 7;
        System.out.println(minimum(ar, k));

    }
}
