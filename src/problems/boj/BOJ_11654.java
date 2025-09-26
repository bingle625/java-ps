package problems.boj;

import java.io.*;

public class BOJ_11654 {
    public void solve() throws IOException {
        // 문제 해결 코드 작성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char c = reader.readLine().charAt(0);
        System.out.println((byte) c);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_11654().solve();
    }
}
