package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2751 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        int n = Integer.parseInt(line);

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            String line2 = reader.readLine();
            numbers[i] = Integer.parseInt(line2);
        }

        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2751().solve();
    }
}
