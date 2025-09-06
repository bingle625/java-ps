package problems.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1330 {
    public void solve() throws IOException {
        /*
         * 1. 1 1
         * 2. -10000 -10000
         * 3. 0 1
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        String[] twoNumbers = s.split(" ");
        int a = Integer.parseInt(twoNumbers[0]);
        int b = Integer.parseInt(twoNumbers[1]);

        String result;
        if (a > b) {
            result = ">";
        } else if (a < b) {
            result = "<";
        } else{
            result = "==";
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1330().solve();
    }
}
