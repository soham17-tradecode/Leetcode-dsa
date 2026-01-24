

public class longestSubStringWithSameLetter {
    static int sameLetter(String s, int k)
    {
        int low = 0 ,res = Integer.MIN_VALUE;
        int n = s.length();
        int max = 0;
        int [] arr = new int[26];

        for (int high = 0 ; high<n ;high++)
        {
            arr[s.charAt(high) - 'A']++;
            max = Math.max(max,arr[s.charAt(high) - 'A']);
            if (high - low+1 - max >k)
            {
                arr[s.charAt(low) - 'A']--;
                low++;
            }


            res = Math.max(res,high-low+1);

        }
        return res;


    }

    public static void main(String[] args) {
        String s = "ABAB";
        int  k = 2;
        System.out.println(sameLetter(s,k));

    }
}
