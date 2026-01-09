package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1463 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1_000_001];
        Arrays.fill(dp, 0);

        for(int i=2; i<1_000_001; i++ ){
            int min = 1_000_005;
            if(i%2 == 0) min = Integer.min(min, dp[i/2]);
            if(i%3 == 0) min = Integer.min(min, dp[i/3]);
            min = Integer.min(min, dp[i-1]);
            dp[i] = min+1;
        }

        int target = Integer.parseInt(br.readLine());
        
        System.out.println(dp[target]);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_1463().solve();
    }
}
