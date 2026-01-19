public class dutchNationalFlag {
    static void Dutch(int[] nums) {


        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = temp;

            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }


        for (int va : nums) System.out.println(va);

    }

    public static void main(String[] args) {

        int[] ar = {2, 0, 2, 1, 1, 0};
        Dutch(ar);

    }
}
