import java.util.Arrays;

public class arr {

    static int[] res(int[] ar, int p) {
        int low = 0;
        int n = ar.length;
        int max = 0;
        int [] r = new int[n-p+1];
        int high = p-1;

        for ( int i = low ; i<=high ;i++)
        {
            max = Math.max(max,ar[high]);
        }
        int k = 0;
        int ans = 0;
        r[k++] = max;
        while (high<n-1)
        {
            low++;

            high++;
            for (int i = low ; i<=high;i++)
            {
                ans = Math.max(ans,ar[i]);
            }
            r[k++] = ans;




        }
        return r;


    }

    public static void main(String[] args) {
        int ar [] ={1,2,5,6,7,8,2};
        int k = 3;
        System.out.println(Arrays.toString(res(ar, k)));
    }

}
