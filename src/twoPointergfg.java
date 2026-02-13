public class twoPointergfg {
    public static void main(String[] args) {
        int [] arr ={0, 1, 3, 0, 2, 2, 4, 2};
        int k = 2;

        int i = 0 ,j= arr.length-1;
        int count = 1;

        while (i<j)
        {
            if (arr[i]==k)
            {
                count++;
                i++;
            }
            else {
                i++;
            }


        }
        System.out.println(count);
    }
}
