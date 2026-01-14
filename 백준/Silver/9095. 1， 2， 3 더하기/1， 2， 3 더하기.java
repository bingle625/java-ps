import java.io.*;
import java.util.*;

public class Main {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        dp[4] = 7;

        // 1 -> 1개
        // 2 -> 2개
        // 3 -> 4개 (1+1+1, 2+1, 1+2, 3)
        // 4 -> (1+3), (2+2), (3+1) -> 4+2+1

        for(int i=5; i<11; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            int target = Integer.parseInt(br.readLine());
            sb.append(dp[target] + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solve();
    }
}
