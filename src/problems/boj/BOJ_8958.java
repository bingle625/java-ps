package problems.boj;

import java.io.*;

public class BOJ_8958 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기

        int t = Integer.parseInt(line);

        for (int i = 0; i < t; i++) {
            String s = reader.readLine();
            int result = 0;
            int current = 0;
            char[] cs = s.toCharArray();
            for (char c : cs) {
                if(c == 'O') result += ++current;
                else current=0;
            }
            System.out.println(result);
        }

    }

    public static void main(String[] args) throws IOException {
        new BOJ_8958().solve();
    }
}
