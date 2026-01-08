package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_10989 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(numbers[i] + "\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_10989().solve();
    }
}
