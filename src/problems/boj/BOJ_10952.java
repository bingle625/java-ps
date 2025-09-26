package problems.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10952 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isContinue = true;
        while(isContinue){
            String s = reader.readLine();

            String[] s2 = s.split(" ");
            int result = Integer.parseInt(s2[0]) + Integer.parseInt(s2[1]);
            if(result == 0) break;
            System.out.println(result);
        }

    }

    public static void main(String[] args) throws IOException {
        new BOJ_10952().solve();
    }
}
