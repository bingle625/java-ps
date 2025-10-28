package problems.boj;

import java.io.*;

public class BOJ_10809 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        int[] as = new int[26];
        for (int i = 0; i < as.length; i++) {
            as[i] = -1;
        }

        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i]-97;
            if(as[index] == -1) as[index] = i;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < as.length; i++) {
            builder.append(as[i]);
            builder.append(" ");
        }

        System.out.println(builder);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10809().solve();
    }
}
