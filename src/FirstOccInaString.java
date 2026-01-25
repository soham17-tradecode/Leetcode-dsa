public class FirstOccInaString {
    static int str(String hayStack , String needle)
    {

        for (int i=0 ;i<=hayStack.length()-needle.length(); i++)
        {
            if (hayStack.substring(i,i+needle.length()).equals(needle))
            {
                return i;
            }
        }
        return -1;




    }



    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(str(haystack,needle));

    }
}
