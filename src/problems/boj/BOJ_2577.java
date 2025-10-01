package problems.boj;

import java.io.*;

public class BOJ_2577 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int result = a * b * c;
        int[] numbers = new int[10];
        
        int remainder = result;
        while (remainder != 0) {
            int target = remainder % 10;
            numbers[target] += 1;

            remainder = remainder / 10;
        }

        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2577().solve();
    }
}
