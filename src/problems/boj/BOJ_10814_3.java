package problems.boj;

import java.util.*;
import java.io.*;

public class BOJ_10814_3 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[][] pairs = new String[n][2];

        for(int i=0; i<n; i++){
            String[] ss = reader.readLine().split(" ");
            pairs[i] = ss;
        }

        Arrays.sort(pairs, (a, b)->{
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });

        StringBuilder sb = new StringBuilder();
        for(String[] pair: pairs){
            sb.append(pair[0] + " " + pair[1] + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10814_2().solve();
    }
}
