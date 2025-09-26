package problems.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10998 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = reader.readLine().split(" ");
        int a = Integer.parseInt(ss[0]);
        int b = Integer.parseInt(ss[1]);

        System.out.println(a*b);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10998().solve();
    }
}
