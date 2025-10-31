package problems.boj;

import java.io.*;

public class BOJ_2775 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        
        int t = Integer.parseInt(line);

        for (int i = 0; i < t; i++) {
            String line1 = reader.readLine();
            String line2 = reader.readLine();

            int k = Integer.parseInt(line1);
            int n = Integer.parseInt(line2);

            System.out.println(getHumanCount(k, n));
        }
    }

    public static int getHumanCount(int k, int n){
        if(k == 0) return n;
        if(n == 1) return 1;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getHumanCount(k-1, i);
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2775().solve();
    }
}
