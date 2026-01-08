package problems.boj;

import java.util.*;
import java.io.*;

public class BOJ_2839_3 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        int[] dp = new int[5001];

        Arrays.fill(dp, -1);
        dp[3] = 1;
        dp[5] = 1;
        
        for(int i = 6; i<n+1; i++){
            int a = dp[i-3];
            int b = dp[i-5];

            int min = 10001;

            if(a > 0) min = Integer.min(min, a);
            if(b > 0) min = Integer.min(min, b);
            
            if(min > 0 && min != 10001) dp[i] = min+1;
            else dp[i] = -1;
        }


        System.out.println(dp[n]);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2839_3().solve();
    }
}
