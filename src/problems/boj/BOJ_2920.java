package problems.boj;

import java.io.*;

public class BOJ_2920 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        String result = line.replace(" ", "");

        if(result.equals("12345678")) System.out.println("ascending");
        else if(result.equals("87654321")) System.out.println("descending");
        else System.out.println("mixed");
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2920().solve();
    }
}
