public class kadanegfg {

    static int  minSubArray (int [] arr)
    {

        int bestEnding = arr[0];
        int ans = 0;
        for(int i=1;i<arr.length;i++)
        {
            int v1 = bestEnding + arr[i];
            int v2 = arr[i];

            bestEnding = Math.min(v1,v2);
//            System.out.println(bestEnding);
            ans = Math.min(ans ,bestEnding);
            System.out.println(ans);
        }

        return ans;
    }


    public static void main(String[] args) {


        int [] arr = {3,-4, 2,-3,-1, 7,-5};
        System.out.println(minSubArray(arr));

    }
}
