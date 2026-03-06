public class leetcode17 {
//    static int reverse (int x)
//    {
//        int sum = 0;
//        while(Math.abs(x)>0)
//        {
//            int rev = x%10;
//            sum = (sum*10)+rev;
//            x/=10;
//
//
//        }
//        return sum;
//    }
    static int reverse (int x)
    {
        int sum = 0;
        boolean isNegative = x<0;
       String srt = String.valueOf(Math.abs(x));
       StringBuilder sb = new StringBuilder(srt).reverse();
       sum = Integer.parseInt(sb.toString());



        return isNegative ?-sum : sum;
    }


    public static void main(String[] args) {

        int p = -123;
        System.out.println(reverse(p));
    }
}
