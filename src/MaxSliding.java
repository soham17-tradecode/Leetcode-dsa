public class MaxSliding {
    static int isWinner(int[] player1, int[] player2) {
      int s1= player1[0] ,s2=player2[0];
      int ans=0;
      for (int i=1 ;i<player1.length;i++)
      {
          if (i==1)
          {
              if (player1[i-1]==10) s1+=2*player1[i];
              else s1+=player1[i];

              if (player2[i-1]==10) s2+=2*player2[i];
              else s2+=player2[i];
          }
          else {
              if (player1[i-1]==10 || player1[i-2]==10) s1+=2*player1[i];
              else s1+=player1[i];

              if (player2[i-1]==10 || player2[i-2]==10) s2+=2*player2[i];
              else s2+=player2[i];

          }
      }




        if (s1==s2) ans=0;
        else if (s1>s2) {
            ans=1;

        }
        else {
            ans = 2;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] player1 = {5, 10, 3, 2};
        int[] player2 = {6, 5, 7, 3};
        System.out.println(isWinner(player1, player2));

    }
}
