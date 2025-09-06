package problems.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1008 {
    public void solve() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        double a = Character.getNumericValue(s.charAt(0));
        double b = Character.getNumericValue(s.charAt(2));
        System.out.println(a / b);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1008().solve();
    }
}
