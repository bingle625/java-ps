package problems.boj;

import java.io.*;
import java.util.*;

public class BOJ_11047 {
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nArr[0];
        int k = nArr[1];

        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int cur = k;
        int res = 0;
        while(cur != 0){
            int target = 1;
            for(int i=n-1; i>=0; i--){
                if(cur >= numbers[i]){
                    target = numbers[i];
                    break;
                }
            }
            res += cur / target;
            cur = cur % target;
        }

        System.out.println(res);

    }

    public static void main(String[] args) throws Exception {
        new BOJ_11047().solve();
    }
}
