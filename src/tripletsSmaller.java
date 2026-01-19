import java.util.Arrays;

public class tripletsSmaller {
    static int TripletSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum >= target) {
                    right--;

                } else  {

                    ans = ans + (right - left);
                    left++;
                }

            }
        }
        return ans;


    }

    public static void main(String[] args) {
//        int []ar={-2,0,1,3};
//        int target = 2;

        int [] ar= {5, 1, 3, 4, 7};
        int target = 12;
        System.out.println(TripletSmaller(ar,target));

    }
}
