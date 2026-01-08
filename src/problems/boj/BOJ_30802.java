package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_30802 {
    
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numPerSize = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] TandP = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int t = TandP[0];
        int p = TandP[1];

        int tCnt = 0;
        for(int number: numPerSize){
            tCnt += (number / t) + (number % t != 0 ? 1 : 0);
        }
        StringBuilder sb = new StringBuilder();

        sb.append(tCnt + "\n");

        sb.append((n/p) + " " + (n%p));

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ_30802().solve();
    }
}
