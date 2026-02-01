public class happy202 {

    static boolean isHappy(int n) {
        int slow = n,fast = n;

        //using while
        while (fast != 1)
        {
            slow =func(slow);
            fast = func(fast);
            fast  = func(fast);
            if (slow == fast && slow !=1)
            {
                return false;
            }

            fast = 1;
        }


        //using do while

        do{

            slow = func(slow);
            fast = func(func(fast));

        }while (slow!=fast);

//       return slow == 1;

        return true;

    }

    static int func(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum = sum + d * d;

        }
        return sum;

    }


    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));

    }
}
