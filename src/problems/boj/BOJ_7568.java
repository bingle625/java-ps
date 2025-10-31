package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_7568 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        // 50 * 50 이니까 걍 완탐 갈겨볼까

        int n = Integer.parseInt(line);
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list[i][0] = numbers[0];
            list[i][1] = numbers[1];
        }

        int[] rank = new int[n];

        for (int i = 0; i < list.length; i++) {
            int x = list[i][0];
            int y = list[i][1];
            
            int cnt = 1;
            for (int j = 0; j < rank.length; j++) {
                int p = list[j][0];
                int q = list[j][1];
                if(p > x && q > y) cnt++;
            }

            rank[i] = cnt;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rank.length; i++) {
            sb.append(rank[i] +" ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_7568().solve();
    }
}
