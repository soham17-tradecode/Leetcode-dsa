import java.util.Arrays;

public class p1 {
    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] r = new int[arr.length];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    r = new int[]{arr[i], arr[j]};
                }
            }
        }
        return r;
    }

    static int[] twoSum1(int []arr, int target) { // best two pointer approach
        int n = arr.length;
        int[] r = new int[arr.length];
        int i=0 ,j=n-1;
        while(i<j)
        {
            int sum= arr[i]+arr[j];
            if (sum == target)
            {
                 return new int[]{i+1,j+1};
            } else if (sum < target ) {
                i++;
            }
            else {
                j--;
            }

        }
        return r;
    }


    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        int arr1[] ={2,7,11,15};
        int tar = 18;
        System.out.println(Arrays.toString(twoSum1(arr1,tar)));


//        System.out.println(Arrays.toString(twoSum(arr, target)));

    }
}
