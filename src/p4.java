import java.util.Arrays;

public class p4 {

    static int[] squareSorted(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = right; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;

    }


    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};


        System.out.println(Arrays.toString(squareSorted(arr)));


    }
}
