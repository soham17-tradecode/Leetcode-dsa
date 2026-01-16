public class p3 {
    static int removeDup(int[] arr) { //remove duplicate
        int i = 0, unique = 1, j = 1;

        int n = arr.length;
        while (j < n) {
            if (arr[j] == arr[j - 1]) {
                j++;

            } else {
                arr[i + 1] = arr[j];
                i++;
                j++;
                unique++;
            }

        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 31};
        System.out.println(removeDup(arr));

    }
}
