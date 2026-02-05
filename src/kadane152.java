public class kadane152 {
    static int maxProduct (int [] arr)
    {
        int minEnding = arr[0];
        int maxEnding = arr[0];
        int res = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            int v1 = arr[i];
            int v2 = minEnding  * arr[i];
            int v3 = maxEnding * arr[i];
            maxEnding = Math.max(v1,Math.max(v2,v3));
            minEnding = Math.min(v1,Math.min(v2,v3));

            res  = Math.max(res,Math.max(maxEnding,minEnding));


        }
        return  res;




    }

    public static void main(String[] args) {
        int [] arr= {2,3,-2,4};
        System.out.println(maxProduct(arr));

    }
}
