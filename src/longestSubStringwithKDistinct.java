import java.util.HashMap;

public class longestSubStringwithKDistinct {
    static int LongestSubString(String arr, int k) {
        int n = arr.length();
        HashMap<Character, Integer> ar = new HashMap<>();
        int low = 0, res = -1;

        for (int high = 0; high < n; high++) {

            char c = arr.charAt(high);
            ar.put(c,ar.getOrDefault(c,0)+1);

            while(ar.size()>k)
            {
               char leftChar = arr.charAt(low);
                ar.put(leftChar,ar.get(leftChar)-1);
                if (ar.get(leftChar)==0)
                {
                    ar.remove(leftChar);
                }
                low++;
            }
            if (ar.size()==k)
            {
                res = Math.max(res,high-low+1);
            }




        }
        return res;
    }


    public static void main(String[] args) {
        String arr = "aabacbebebe";
        int k = 3;
        System.out.println(LongestSubString(arr, k));

    }
}
