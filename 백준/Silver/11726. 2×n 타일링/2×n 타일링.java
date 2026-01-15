import java.io.*;
import java.util.*;

public class Main {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String line = br.readLine();
        int dp[] = new int[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;

        for(int i=5; i<1001; i++){
            // dp 를 구할때에도 나머지로 구해줘야 정수 오버플로우 넘지 않음
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[Integer.parseInt(br.readLine())] % 10007);
    }

    public static void main(String[] args) throws Exception {
        new Main().solve();
    }
}
