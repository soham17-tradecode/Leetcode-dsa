public class arr {
    public static void main(String[] args) {
        int arr [] = new int[128];
        String s = "ADOBECODEBANC";

        for (char c :s.toCharArray())
        {
            int i= arr[c]++;
            System.out.println(i);
        }
    }

    }
