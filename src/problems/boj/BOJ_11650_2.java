package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_11650_2 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[][] map = new int[n][2];

        for (int i = 0; i < n; i++) {
            int[] xy = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[i][0] = xy[0];
            map[i][1] = xy[1];
        }

        Arrays.sort(map, (x,y)-> {
            if(x[0] == y[0]) return x[1] - y[1];
            
            return x[0] - y[0];
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < map.length; i++) {
            sb.append(map[i][0] + " " + map[i][1] + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_11650_2().solve();
    }
}
