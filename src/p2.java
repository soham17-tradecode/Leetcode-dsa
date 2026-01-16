public class p2 {
    //rearrange 0 and 1
    static void segregation (int [] arr)
    {
        int n = arr.length;
        int i=0 ,k=0;
        int j=n-1;

        while(i<j)
        {
            if (arr[i]==0)
            {
                arr[k] =arr[i];
                i++;
                k++;
            } else if (arr[i]==arr[j]) {
                j--;

            } else if (arr[i]!=arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
        for (int value : arr) {
            System.out.println(value);

        }

    }


    public static void main(String[] args) {
        int[] ar ={1,1,1,1,0};
        segregation(ar);

    }
}
