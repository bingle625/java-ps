package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_11399 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] nArr = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(nArr, (a, b) -> b-a);

        int sum =0;
        for(int i=0; i<n; i++){
            sum += nArr[i] * (i+1);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_11399().solve();
    }
}
