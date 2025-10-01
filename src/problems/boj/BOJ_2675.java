package problems.boj;

import java.io.*;

public class BOJ_2675 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            String[] lines = reader.readLine().split(" ");
            int repeat = Integer.parseInt(lines[0]);
            String text = lines[1];
            StringBuilder builder = new StringBuilder();
            for(char c : text.toCharArray()){
                for (int j = 0; j < repeat; j++) {
                    builder.append(c);
                }
            }
            System.out.println(builder);
        }

    }

    public static void main(String[] args) throws IOException {
        new BOJ_2675().solve();
    }
}
