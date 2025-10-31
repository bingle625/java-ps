package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2869 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = numbers[0];
        int b = numbers[1];
        int v = numbers[2];

        int res = (v-a) / (a-b);
        float remainder = (v-a) % (a-b);

        int result = 0;
        if (remainder == 0) result = res + 1;
        else result = res +2;

        System.out.println(result);

    }

    public static void main(String[] args) throws IOException {
        new BOJ_2869().solve();
    }
}
