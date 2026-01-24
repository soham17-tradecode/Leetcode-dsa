import java.util.HashMap;
import java.util.Map;

public class fruiIntoBasket {

    static int fruit(int []arr)
    {
        Map<Integer ,Integer> fu = new HashMap<>();

        int low = 0;
        int res=0;
        int n = arr.length;

        for (int high = 0; high < n ; high++)
        {
            fu.put(arr[high], fu.getOrDefault(arr[high],0)+1);

            while(fu.size()>2)
            {
                int leftFruit = arr[low];
                fu.put(leftFruit,fu.get(leftFruit)-1);
                if (fu.get(leftFruit)==0)
                {
                    fu.remove(leftFruit);
                }

                low++;
                System.out.println(low);

            }
            res = Math.max(res,high - low+1);
//            System.out.println(res);
        }
        return res;
    }


    public static void main(String[] args) {
        int [] arr={0,1,2,2};
        System.out.println(fruit(arr));
    }
}
