package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_1546 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        int n = Integer.parseInt(line);
        int[] scores = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int m = -1;
        int sum = 0;
        for (int i : scores) {
            m = Integer.max(m, i);
            sum += i;
        }

        float score = sum / (float) m * 100 / scores.length;

        System.out.println(score);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1546().solve();
    }
}
