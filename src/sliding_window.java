public class sliding_window {
    static int  max(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = k-1;
        int sum = 0;
        int res = 0;
        for (int i = low ; i<=high;i++)
        {
            sum = sum + arr[i];

        }
        while(high<n)
        {
            res = Math.max(res,sum);
            high++;
            low++;

            if (high==n)
            {
                break;
            }

            sum = sum - arr[low - 1];

            sum = sum+ arr[high];


        }
        return res;

    }

    public static void main(String[] args) {
        int [] arr = {100,200,300,400};
        int k = 2;
        System.out.println(max(arr,k));


    }
}
