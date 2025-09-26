package problems.boj;

import java.io.*;

public class BOJ_27866 {
    public void solve() throws IOException {
        // 문제 해결 코드 작성
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();
        int i = Integer.parseInt(s2);

        System.out.println(s.charAt(i-1));
    }

    public static void main(String[] args) throws IOException {
        new BOJ_27866().solve();
    }
}
