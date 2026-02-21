import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem6 {
    static String convert(String s , int numRows)
    {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();

        }
        for (char c :s.toCharArray())
        {
            rows[idx].add(c);
            if (idx==0)
            {
                d = 1;
            } else if (idx == numRows-1) {
                d = -1;

            }
            idx +=d;
        }
        StringBuilder sb  =new StringBuilder();
        for (List<Character> row : rows)
        {
            for (char c : row)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s  = "PAYPALISHIRING";
        System.out.println( convert(s,3));

    }
}
