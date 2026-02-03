public class kadane53 {
    static int maxSubarray(int [] nums)
    {
     int total = 0;
     int res = nums[0];
     for (int n :nums)
     {
         if (total<0)
         {
             total = 0;

         }
         total+=n;
         res = Math.max(res,total);
     }
     return res;
    }

    public static void main(String[] args) {

        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(arr));

    }
}
