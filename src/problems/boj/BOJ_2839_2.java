package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2839_2{
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] dp = new int[5001];
        Arrays.fill(dp, 5000);
        dp[3] = 1;
        dp[4] = 1;
        dp[5] = 1;

        for(int i = 6; i<= n; i++){
            if(dp[i-5] != -1) dp[i] = Integer.min(dp[i], dp[i-5] +1);
            if(dp[i-4] != -1) dp[i] = Integer.min(dp[i], dp[i-4] +1);
            if(dp[i-3] != -1) dp[i] = Integer.min(dp[i], dp[i-3] +1);
        }

        System.out.println(dp[n] == 5000 ? -1 : dp[n]);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2839_2().solve();
    }
}
