package problems.boj;

import java.util.*;
import java.io.*;

public class BOJ_7568_2 {
    
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[][] pairArr = new int[n][2];
        for(int i=0; i< n; i++){
            pairArr[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int cnt;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            cnt = 0;
            for(int j=0; j<n; j++){
                if(i!=j){
                    if(pairArr[i][0] < pairArr[j][0] && pairArr[i][1] < pairArr[j][1]) cnt++;
                }
            }
            sb.append((cnt+1) + " ");
        }

        System.out.println(sb);

    }

    public static void main(String[] args) throws IOException {
        new BOJ_7568_2().solve();
    }
}
