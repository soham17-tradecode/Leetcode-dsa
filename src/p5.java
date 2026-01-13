import java.util.Arrays;

public class p5 {
    static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int a1 = arr1.length;


        int a2 = arr2.length;

        int[] arr3 = new int[a1 + a2];
        int i = 0, j = 0, k = 0;
        while (i < a1 && j < a2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            }  else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(j<a2)
        {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        return arr3;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println(Arrays.toString(mergeTwoSortedArray(arr1, arr2)));


    }
}
