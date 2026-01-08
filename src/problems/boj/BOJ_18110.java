package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_18110 {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];

        Long boarder = Math.round(n /100.0 *15.0);
        int boarderI = boarder.intValue();

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);

        // 3명 제외시, index 3부터 시작 10명일시, 987 제외 -> 7전까지, 10 - 3
        int sum =0;
        for(int i=boarderI; i<n-boarderI; i++){
            sum+= arr[i];
        }
        System.out.println(Math.round(sum / (float) (n - boarderI*2)));
    }

    public static void main(String[] args) throws IOException {
        new BOJ_18110().solve();
    }
}
