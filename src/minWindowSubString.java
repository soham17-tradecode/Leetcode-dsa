public class minWindowSubString {
    //sliding window most important questions
    static String windowSub(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n < m) {
            return "";
        }

        int[] needed = new int[128];

        for (char c : t.toCharArray()) {
            needed[c]++;
        }
        int left = 0, right = 0;
        int res = Integer.MAX_VALUE;
        int start = 0;
        int req = t.length();

        while (right < s.length()) {
            char r = s.charAt(right);
            if (needed[r] > 0) {
                req--;
            }
            needed[r]--;
            right++;

            while (req == 0) {
                int len = right - left;
                if (len < res) {
                    res = len;
                    start = left;
                }
                char l = s.charAt(left);
                needed[l]++;
                if (needed[l] > 0) {
                    req++;
                }


                left++;
            }


        }


        if (res == Integer.MAX_VALUE) {
            return "";
        }
        System.out.println(start + "," + res);
        return s.substring(start, start + res);

    }

    static boolean func(int[] have, int[] needed) {
        for (int i = 0; i < 256; i++) {
            if (have[i] < needed[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(windowSub(s, t));



    }
}
