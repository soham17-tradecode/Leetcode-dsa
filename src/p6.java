import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p6 {
    static int[] sortArray(int[] arr) {

        int n = arr.length-1;
//        int i = 0, j = 1;
//        while (i < n) {
//            if (arr[j] < arr[i]) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//
//
//            } i++;
//            j++;
//            n++;
//
//        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;


    }
    static List<List<Integer>> threeSum(int []nums)
    { //three sum problem triplets
        List<List<Integer>> re = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++)
        {
            if (i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int total = nums[i]+nums[j]+nums[k];
                if (total>0)
                {
                    k--;

                }
                else if (total<0)
                {
                    j++;
                }
                else {
                    re.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while (nums[j]==nums[j-1] && j<k)
                    {
                        j++;
                    }
                }
            }

        }
        return re;

    }


    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,4};
//        System.out.println(Arrays.toString(threeSum(arr)));

        System.out.println(threeSum(arr));
    }
}
