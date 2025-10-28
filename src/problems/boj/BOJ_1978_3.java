package problems.boj;

import java.io.*;
import java.util.Arrays;

public class BOJ_1978_3 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        String line2 = reader.readLine();

        int n = Integer.parseInt(line);
        int[] numbers = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxn = -1;
        for (int i : numbers) {
            maxn = Integer.max(i, maxn);
        }

        boolean[] primeBoolean = new boolean[maxn+1];
        Arrays.fill(primeBoolean, true);
        primeBoolean[0] = false;
        primeBoolean[1] = false;

        for (int p = 2; p*p <= maxn; p++) {
            if(!primeBoolean[p]) continue;
            for (int i = p*p; i <= maxn; i += p) {
                primeBoolean[i] = false;
            }
        }

        int cnt = 0;
        for (int b : numbers) {
            if(primeBoolean[b]) cnt++;
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_1978_3().solve();
    }
}
