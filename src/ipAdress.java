public class ipAdress {
    public static void main(String[] args) {
        String s = "172.42.12.63";
        int n = s.length();

        StringBuffer sb = new StringBuffer();
        int j = 0;
        int [] arr = new int[4];
        for (int i=0 ;i<n ;i++)
        {
            char c = s.charAt(i);
            if (c=='.')
            {
                int w = Integer.parseInt(sb.toString());

                arr[j++] = w;
                sb.setLength(0);

            }
            else {

                sb.append(c);
            }

        }

        arr[j] = Integer.parseInt(sb.toString());
//        StringBuilder binary = new StringBuilder();


        int decimal = 0;

       for (int i = 0 ;i< arr.length;i++)
       {
            decimal = arr[i];
//           while(decimal>0)
//           {
//               binary.append(decimal%2);
//               decimal/=2;
//           }
           String binary = Integer.toBinaryString(decimal);
           System.out.print(binary+".");
       }




    }
}
