package problems.boj;

import java.io.*;

public class BOJ_31403 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine(); // 입력 한 줄 받기
        String line2 = reader.readLine(); // 입력 한 줄 받기
        String line3 = reader.readLine(); // 입력 한 줄 받기
        
        int result1 = Integer.parseInt(line1) + Integer.parseInt(line2) - Integer.parseInt(line3);
        int result2 = Integer.parseInt(line1 + line2) - Integer.parseInt(line3);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_31403().solve();
    }
}
