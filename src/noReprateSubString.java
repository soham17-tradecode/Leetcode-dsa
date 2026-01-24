import java.util.HashMap;
import java.util.Map;

public class noReprateSubString {
    static int noDuplicate(String arr) {

        int low = 0;
        int n = arr.length();
        int res = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int high = 0; high < n; high++) {

            char c = arr.charAt(high);
//            lastIndex.put(c,lastIndex.getOrDefault(c,0)+1);
            if (lastIndex.containsKey(c)) {
                low = Math.max(low, lastIndex.get(c) + 1);
//                System.out.println("map"+lastIndex.get(c));
                System.out.println("low"+low);

            }
            lastIndex.put(c, high);
            res = Math.max(res, high - low + 1);

        }
        return res;
    }


    public static void main(String[] args) {
        String a = "abcabcbb";
        System.out.println(noDuplicate(a));

    }
}
