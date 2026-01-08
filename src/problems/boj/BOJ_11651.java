package problems.boj;

import java.util.*;
import java.io.*;

public class BOJ_11651 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Arrays.sort(arr, (a, b) -> {
           int sort = a[1] - b[1];
           if(sort == 0) sort = a[0] - b[0];
           return sort;
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_11651().solve();
    }
}
