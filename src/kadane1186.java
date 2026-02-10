import java.util.AbstractMap;
import java.util.Arrays;

public class kadane1186 {

    static  int  maximumSum(int [] arr)
    {
        int noDelete = arr[0];
        int oneDelete = 0;
        int res = arr[0];
        for (int i= 1;i< arr.length;i++)
        {
            int preNodelete = noDelete;
            noDelete = Math.max(noDelete+arr[i],arr[i]);

            oneDelete = Math.max(preNodelete,oneDelete+arr[i]);

            res = Math.max(res,Math.max(noDelete,oneDelete));
        }

        return  res;

    }

    public static void main(String[] args) {
        int [] arr = {1,-2,0,3};
        System.out.println((maximumSum(arr)));

    }
}
