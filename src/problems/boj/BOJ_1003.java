package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1003 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp_0 = new int[41];
        int[] dp_1 = new int[41];

        Arrays.fill(dp_0, 0);
        Arrays.fill(dp_1, 0);

        dp_0[0] = 1;
        dp_1[1] = 1;

        for(int i=2; i<41; i++){
            dp_0[i] = dp_0[i-1] + dp_0[i-2];
            dp_1[i] = dp_1[i-1] + dp_1[i-2];
        }

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            sb.append(dp_0[num] + " " + dp_1[num] + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_1003().solve();
    }
}
