package problems.boj;

import java.io.*;

public class BOJ_2609 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] texts = reader.readLine().split(" ");
        int a = Integer.parseInt(texts[0]);
        int b = Integer.parseInt(texts[1]);

        int mini = Integer.min(a,b);
        
        int res1 = 1;
        for (int i = 1; i <= mini; i++) {
            if(a%i == 0 && b%i == 0) res1 = i;
        }

        int res2 = (a / res1) * (b / res1) * res1;

        System.out.println(res1);
        System.out.println(res2);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_2609().solve();
    }
}
