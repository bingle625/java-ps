package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_2475 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        
        int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;

        for (int i : numbers) {
            result += i*i;
        }

        System.out.println(result % 10);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2475().solve();
    }
}
